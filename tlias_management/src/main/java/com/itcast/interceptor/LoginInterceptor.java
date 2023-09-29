package com.itcast.interceptor;

import cn.hutool.core.util.StrUtil;
import com.alibaba.fastjson.JSONObject;
import com.aliyuncs.utils.StringUtils;
import com.itcast.pojo.Result;
import com.itcast.utils.JwtUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * TODO Spring拦截器
 *
 * @author Aaron.
 * @date 2023/9/26 17:30
 */
@Slf4j
@Component
public class LoginInterceptor implements HandlerInterceptor {

    //前置方式
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("进入拦截器。。。。");
        //获取令牌
        String jwt = request.getHeader("token");
        if(StrUtil.isBlank(jwt)){
            log.info("令牌不存在.请登录");
            String meg = JSONObject.toJSONString(Result.error("NOT_LOGIN"));
            response.getWriter().write(meg);
            return false;
        }

        try {
            log.info("令牌不为空，开始解析令牌");
            JwtUtils.parseJWT(jwt);
        } catch (Exception e) {
            log.info("令牌不存在去登录");
            String meg = JSONObject.toJSONString(Result.error("NOT_LOGIN"));
            response.getWriter().write(meg);
            return false;
        }
        log.info("令牌解析成功，放行");
        return true;
    }
}
