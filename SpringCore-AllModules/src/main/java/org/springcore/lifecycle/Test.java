package org.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycleconfig.xml");
//        Samosa s = (Samosa) context.getBean("s1");
//        System.out.println(s);
        context.registerShutdownHook();
//
//        Pepsi p = (Pepsi) context.getBean("p1");
//        System.out.println(p);
        Example e = (Example) context.getBean("e1");
        System.out.println(e);
    }
}
