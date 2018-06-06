package com.yongrui.springbootdemo.girl.pojo;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class Girl {

    private Integer id;

    private Integer age;

    private String cupSize;

    private BigDecimal mondy;

    private String url;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public BigDecimal getMondy() {
        return mondy;
    }

    public void setMondy(BigDecimal mondy) {
        this.mondy = mondy;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "id=" + id +
                ", age=" + age +
                ", cupSize='" + cupSize + '\'' +
                ", mondy=" + mondy +
                ", url='" + url + '\'' +
                '}';
    }
}
