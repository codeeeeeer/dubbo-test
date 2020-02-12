package com.lewjay;

import com.lewjay.model.ParamInfo;
import com.lewjay.service.IGreetService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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
            Map<String, String> paramMap = new HashMap<>();
            paramMap.put("target", "biubiubiu");
            paramMap.put("source", "papapa");
            paramMap.put("serial", i + "");
            Set<String> greet = demoService.greet(paramMap);
            System.out.println(greet);
        }

        ParamInfo paramInfo = new ParamInfo();
        paramInfo.setAge(20);
        paramInfo.setEnterance(new Date());
        paramInfo.setId(12345678L);
        paramInfo.setMoney(new BigDecimal("10000000"));
        paramInfo.setName("Johnson");
        paramInfo.setTestDouble(10086.0d);
        String desc = demoService.desc(paramInfo);
        System.out.println(desc);
        context.close();
    }
}
