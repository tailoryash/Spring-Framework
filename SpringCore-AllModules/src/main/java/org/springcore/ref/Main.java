package org.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("refconfig.xml");
        A temp = (A)context.getBean("ahref");
        System.out.println(temp.getX());
        System.out.println(temp.getOb().getY());
        Thread t1 = new Thread();
        Thread t2 = new Thread();

        Thread t3 = new Thread();
        t1.setPriority(10);
        t1.start();

//        System.out.println(t.getPriority());
        System.out.println(Thread.currentThread().isDaemon());
    }
}
