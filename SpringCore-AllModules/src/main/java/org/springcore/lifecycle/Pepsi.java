package org.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {
    //lifecycle using implementation

    private int price;

    public Pepsi() {
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pepsi{" +
                "price=" + price +
                '}';
    }

    @Override
    public void destroy() throws Exception {
        //destroy
        System.out.println("Pepsi : Destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
//init
        System.out.println("Pepsi : Init");
    }
}
