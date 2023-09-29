package com.itcast.controller;

import com.itcast.pojo.Emp;
import com.itcast.pojo.Result;
import com.itcast.service.IEmpService;
import com.itcast.utils.JwtUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.Objects;

/**
 * TODO 用户登录
 *
 * @author Aaron.
 * @date 2023/9/26 5:36
 */
@Slf4j
@RestController
public class LoginController {
    @Resource
    private IEmpService iEmpService;

    /**
     * 用户登录
     * @param emp
     * @return data:jwt
     */
    @PostMapping("/login")
    public Result login(@RequestBody Emp emp){
        log.info("用户登录 {},{}",emp.getUsername(),emp.getPassword());
        //调用业务层功能
        Emp loginEmp = iEmpService.login(emp);
        //判断登录的用户名是否存在
        if(!Objects.isNull(loginEmp)){
            log.info("用户名密码正确");
            //用户名存在生成JWT令牌
            HashMap<String, Object> claims = new HashMap<>();
            claims.put("id",loginEmp.getId());
            claims.put("username",loginEmp.getUsername());
            String jwt = JwtUtils.generateJwt(claims);
            //返回给前端
            return Result.success(jwt);
        }
        log.info("用户名和密码不正确");
        return Result.error("用户名或密码不存在");

    }
}
