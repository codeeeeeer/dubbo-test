package com.lewjay.service;

import com.lewjay.model.ParamInfo;

import java.util.Map;
import java.util.Set;

/**
 * 〈〉
 *
 * @author liujie
 * @create 2020/2/10 10:50
 */
public interface IGreetService {
    String greet(String name);

    Set<String> greet(Map<String, String> names);

    String desc(ParamInfo paramBean);
}
