package com.lewjay.service.impl;

import com.lewjay.service.IGreetService;

/**
 * 〈〉
 *
 * @author liujie
 * @create 2020/2/10 10:55
 */
public class GreetServiceImpl implements IGreetService {
    public String greet(String name) {
        return "Hello, " + name;
    }
}
