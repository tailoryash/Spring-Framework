package org.springcore.lifecycle;

public class Samosa {
    private double price;

    @Override
    public String toString() {
        return "Samosa{" +
                "price=" + price +
                '}';
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("Setting price");
        this.price = price;
    }

    public Samosa() {
    }

    public void init(){
        System.out.println("Init method");
    }
    public void destroy(){
        System.out.println("Destroy method");
    }
}
