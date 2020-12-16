package com.jykj.materiel.handler;

import com.jykj.materiel.response.Result;
import com.jykj.materiel.response.ResultCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: hjl
 * @Date: 2020/12/7 0007 13:24
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    /**
     *
     * 全局异常处理，捕获所有异常。
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result error(Exception e){
//        e.printStackTrace();
        log.error(e.getMessage());
        return Result.error();
    }


    @ExceptionHandler(ArithmeticException.class)
    @ResponseBody
    public Result error(ArithmeticException e){
//        e.printStackTrace();
        log.error(ResultCode.ARITHMETIC_EXCEPTION.getMessage());
        return Result.error()
                .code(ResultCode.ARITHMETIC_EXCEPTION.getCode())
                .message(ResultCode.ARITHMETIC_EXCEPTION.getMessage());
    }

    @ExceptionHandler(BusinessException.class)
    @ResponseBody
    public Result error(BusinessException e){
//        e.printStackTrace();
        log.error(e.getErrMsg());
        return Result.error()
                .code(e.getCode())
                .message(e.getErrMsg());
    }
}
