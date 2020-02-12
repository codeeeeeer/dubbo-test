package com.lewjay.service.impl;

import com.lewjay.model.ParamInfo;
import com.lewjay.service.IGreetService;

import java.util.Map;
import java.util.Set;

/**
 * 〈〉
 *
 * @author liujie
 * @create 2020/2/10 10:55
 */
public class GreetServiceImpl implements IGreetService {
    @Override
    public String greet(String name) {
        return "Hello, " + name;
    }

    @Override
    public Set<String> greet(Map<String, String> names) {
        return names.keySet();
    }

    @Override
    public String desc(ParamInfo paramBean) {
        return paramBean.toString();
    }
}
