package org.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
    private String course;

    public Example() {
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Example{" +
                "course='" + course + '\'' +
                '}';
    }
    @PostConstruct
    public void start(){
        System.out.println("Init: example");
    }
    @PreDestroy
    public void end(){
        System.out.println("Destroy : example");
    }
}
