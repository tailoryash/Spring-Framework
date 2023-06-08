package org.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "org.springcore.javaconfig")
public class JavaConfig {
//    @Bean
    @Bean(name = {"studentBean", "student", "getStudent"})
    public Student getStudent(){
        return new Student(getSamosa());
    }
    @Bean
    public Samosa getSamosa(){
        return new Samosa();
    }
}
