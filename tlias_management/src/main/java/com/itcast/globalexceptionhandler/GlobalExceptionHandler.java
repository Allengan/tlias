package com.itcast.globalexceptionhandler;

import com.itcast.pojo.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * TODO 全局异常处理类
 *
 * @author Aaron.
 * @date 2023/9/26 21:50
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
    //处理异常
    @ExceptionHandler(Exception.class) //指定能够处理的异常
    public Result exception(Exception e){
        e.printStackTrace(); //打印堆栈中的异常信息
        //捕获异常后响应一个标准的Result
        return Result.error("对不起操作失败，请联系管理员");
    }
}
