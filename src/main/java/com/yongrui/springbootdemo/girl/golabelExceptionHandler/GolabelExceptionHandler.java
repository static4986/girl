package com.yongrui.springbootdemo.girl.golabelExceptionHandler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GolabelExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public String ExceptionHandler(){
        return "sorry,您访问的页面奔溃了！";
    }

}
