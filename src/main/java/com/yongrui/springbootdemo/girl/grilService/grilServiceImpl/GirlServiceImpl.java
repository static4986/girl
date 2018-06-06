package com.yongrui.springbootdemo.girl.grilService.grilServiceImpl;

import com.yongrui.springbootdemo.girl.grilService.GirlService;
import com.yongrui.springbootdemo.girl.pojo.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import java.util.HashMap;
import java.util.Map;

@Component
public class GirlServiceImpl implements GirlService {

    @Autowired
    private Girl girl;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public String getGirlMes() {
        Map resultMap=new HashMap();
        try {

            jdbcTemplate.update("INSERT INTO girl VALUES (null, ?, ?, ?, ?)",23, "我好爱", 200, "这个才是真的编码问题");
        }
        catch (Exception e ){
            System.out.println("捕获异常："+e.getMessage());
            throw e;
        }
        return "success";
    }
}
