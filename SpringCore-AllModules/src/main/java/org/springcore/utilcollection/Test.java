package org.springcore.utilcollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("utilcollectionconfig.xml");
        Person p = context.getBean("person1", Person.class);
//        System.out.println(p);
//        System.out.println(p.getFees().getClass().getName());
        System.out.println(p.getFriends());
        System.out.println("-----------------");
        System.out.println(p.getFees());
        System.out.println("----------------");
        System.out.println(p.getProperties()    );
//        System.out.println(p.getFriends().getClass().getName());
    }
}
