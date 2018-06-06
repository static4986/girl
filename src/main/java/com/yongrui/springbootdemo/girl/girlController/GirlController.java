package com.yongrui.springbootdemo.girl.girlController;


import com.yongrui.springbootdemo.girl.grilService.GirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/girlController")
public class GirlController {

    @Autowired
    private GirlService girlService;

    @RequestMapping(value ="/first" )
    public String helloMethod(){
        return "HelloWorld!";
    }

    @RequestMapping(value = "index")
    public Map<String, Object> index(){
        int a=1/0;
        Map resultMap=new HashMap();
        resultMap.put("success","Success");
        return resultMap;
    }

    @RequestMapping(value = "insertIntoGirl")
    public String insertIntoGirl(){
        String girlMes = girlService.getGirlMes();
        return girlMes;
    }
}
