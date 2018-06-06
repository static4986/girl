package com.yongrui.springbootdemo.girl.secondController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/indexController")
public class IndexController {

    @RequestMapping(value = "indexMethod")
    public String index(){
        return "SecondController";
    }
}
