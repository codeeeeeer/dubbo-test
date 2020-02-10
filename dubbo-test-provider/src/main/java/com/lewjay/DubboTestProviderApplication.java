package com.lewjay;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * 〈〉
 *
 * @author LewJay
 * @create 2020/2/10 16:24
 */
public class DubboTestProviderApplication {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext();
        context.setConfigLocation("/config/dubbo-provider-context.xml");
        context.refresh();
        System.out.println("DemoService provider (XML) is starting...");
        System.in.read();
    }
}
