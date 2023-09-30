package com.itcast.aop;

import com.itcast.controller.LoginController;
import com.itcast.mapper.OperateLogMapper;
import com.itcast.pojo.OperateLog;
import com.itcast.utils.JwtUtils;
import io.jsonwebtoken.Claims;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Objects;

/**
 * TODO 日志切面类
 *
 * @author Aaron.
 * @date 2023/9/30 17:11
 */
@Slf4j
@Aspect
@Component
public class LogAspect {
    @Resource
    private OperateLogMapper operateLogMapper;
    @Resource
    private HttpServletRequest request;
    @Around("@annotation(com.itcast.annotation.Log)")
    public Object recordLog(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

          //获取登录人的id
        String jwt = request.getHeader("token");
        Claims claims = JwtUtils.parseJWT(jwt);
        Integer operateUser = (Integer) claims.get("id");

        // 操作时间
        LocalDateTime operateTime = LocalDateTime.now();

        // 操作类名
        String className = proceedingJoinPoint.getTarget().getClass().getName();

        // 操作方法名
        String methodName = proceedingJoinPoint.getSignature().getName();

        // 操作参数
        Object[] args = proceedingJoinPoint.getArgs();
        String methodParams = Arrays.toString(args);

        // 方法返回值
        //目标方法开始时间
        long startTime = System.currentTimeMillis();
        //调用原始目标方法
        Object result = proceedingJoinPoint.proceed();
        //目标方法结束时间
        long endTime = System.currentTimeMillis();
        String returnValue = Objects.toString(result);

        // 目标方法的耗时
        long costTime = endTime - startTime;

        //记录操作日志
        OperateLog operateLog = new OperateLog(null,operateUser,operateTime,className,methodName,methodParams,returnValue,costTime);
        operateLogMapper.insert(operateLog);
        log.info("AOP操作日志 {}", operateLog);
        return result;
    }
}
