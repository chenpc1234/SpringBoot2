package com.chenpc.admin.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * 处理全局异常
 * 使用 @ControllerAdvice +@ExceptionHandler 处理指定类型的异常
 * @author chenpc
 * @version 1.0
 * @since 2021/3/12/03/12  10:11
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler  {

    /**
     * 处理 算数运算异常 ArithmeticException
     * @param e 异常
     * @return 视图地址
     */
    @ExceptionHandler({ArithmeticException.class})
    public String handlerMathException(Exception e){
        log.info("异常内容是:{}",e.getMessage());
        return "login";
    }

    @ExceptionHandler(NullPointerException.class)
    public ModelAndView handlerNullException(Exception e){
        log.info("异常内容是:{}",e.getMessage());
        return new ModelAndView("login");
    }


}
