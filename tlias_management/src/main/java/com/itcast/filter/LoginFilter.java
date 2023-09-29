package com.itcast.filter;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.itcast.pojo.Result;
import com.itcast.utils.JwtUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * TODO 过滤器
 *
 * @author Aaron.
 * @date 2023/9/26 5:58
 */
@Slf4j
//@WebFilter(urlPatterns = "/*")
public class LoginFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("进入过滤器");
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        //获取请求Url
        String uri = request.getRequestURI();
        if("/login".contains(uri)){
            log.info("过滤器检测到登录操作，直接放行");
            filterChain.doFilter(request,response);
            return;
        }
        //非登录操作,获取JWT令牌
        String jwt = request.getHeader("token");
        System.out.println("获取到令牌："+jwt);
        if(!StringUtils.hasLength(jwt)){
            log.info("JWT令牌为空，去登录");
            Result error = Result.error("NOT_LOGIN");
            //将Result对象转换成JSON对象
            String json = JSONObject.toJSONString(error);
            response.getWriter().write(json);
            return;
        }
        //令牌不为空，进行解析
        try {
            log.info("令牌不为空，进行解析 {}",jwt);
            JwtUtils.parseJWT(jwt);
        } catch (Exception e) {
            log.info("令牌解析失败，进行登录");
            Result error = Result.error("NOT_LOGIN");
            //将Result对象转换成JSON对象
            String json = JSONObject.toJSONString(error);
            response.getWriter().write(json);
            return;
        }
            log.info("令牌解析成功，放行");
            filterChain.doFilter(request,response);
    }
}
