package org.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spelconfig.xml");
        Demo d = context.getBean("demo", Demo.class);
        System.out.println(d);

//        SpelExpressionParser obj = new SpelExpressionParser();
//        Expression expression = obj.parseExpression("22+55");
//        System.out.println(expression.getValue());
    }
}
