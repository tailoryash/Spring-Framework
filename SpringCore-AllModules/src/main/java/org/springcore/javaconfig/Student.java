package org.springcore.javaconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

//@Component("studentclass")
public class Student {
    public Student(Samosa samosa) {
        this.samosa = samosa;
    }

    private Samosa samosa;

    public Samosa getSamosa() {
        return samosa;
    }

    public void setSamosa(Samosa samosa) {
        this.samosa = samosa;
    }

    public void study(){
        this.samosa.samosaeating();
        System.out.println("Student is reading book");
    }



}
