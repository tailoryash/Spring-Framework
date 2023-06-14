package com.aop;

import com.aop.services.PaymentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        PaymentService paymentObj = context.getBean("payment", PaymentService.class);
        paymentObj.makePayment(1000);
    }
}
