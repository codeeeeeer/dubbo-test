package com.lewjay;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 〈〉
 *
 * @author liujie
 * @create 2020/2/11 16:56
 */
public class ParamInfo {
    private String name;
    private Integer age;
    private Long id;
    private Date enterance;
    private BigDecimal money;
    private Double testDouble;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getEnterance() {
        return enterance;
    }

    public void setEnterance(Date enterance) {
        this.enterance = enterance;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Double getTestDouble() {
        return testDouble;
    }

    public void setTestDouble(Double testDouble) {
        this.testDouble = testDouble;
    }

    @Override
    public String toString() {
        return "ParamInfo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", enterance=" + enterance +
                ", money=" + money +
                ", testDouble=" + testDouble +
                '}';
    }
}
