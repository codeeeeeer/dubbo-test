package com.lewjay;

import com.lewjay.service.IGreetService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 〈〉
 *
 * @author LewJay
 * @create 2020/2/10 16:19
 */
public class DubboTestConsumerApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext();
        context.setConfigLocation("/config/dubbo-consumer-context.xml");
        context.refresh();
        System.out.println("DemoService consumer (XML) is starting...");
        IGreetService demoService = context.getBean("greetService", IGreetService.class);
        for (int i = 0; i < 10; i++) {
            System.out.println(demoService.greet("blingbling"));
        }
        context.close();
    }
}
