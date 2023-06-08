package org.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
    @Value("#{22+112}")
    private int x;
    @Value("#{23*5}")
    private int y;
    @Value("#{ T(java.lang.Math).sqrt(144) }")
    private double z;
    //    @Value("#{ T(java.lang.Math}.PI }")
//    private double pi;
    @Value("#{ T(java.lang.Math).PI }")
    private double piValue;
    @Value("#{ new java.lang.String('Yash Tailor') }")
    private String name;

    @Value("#{6-1>2}")
    private boolean isActive;

    @Override
    public String toString() {
        return "Demo{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", piValue=" + piValue +
                ", name='" + name + '\'' +
                ", isActive=" + isActive +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPiValue() {
        return piValue;
    }

    public void setPiValue(double piValue) {
        this.piValue = piValue;
    }
    //    public double getPi() {
//        return pi;
//    }
//
//    public void setPi(double pi) {
//        this.pi = pi;
//    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
