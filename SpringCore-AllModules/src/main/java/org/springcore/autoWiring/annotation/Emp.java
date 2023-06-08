package org.springcore.autoWiring.annotation;

import org.springcore.collection.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
    @Autowired
    @Qualifier("temp2")
    private Address address;

    public Emp() {
    }
    public Emp(Address address) {
        this.address = address;
        System.out.println("Inside constructor");
    }

    @Override
    public String toString() {
        return "Emp{" +
                "address=" + address +
                '}';
    }

    public Address getAddress() {
        return address;
    }


    public void setAddress(Address address) {
        System.out.println("setting");
        this.address = address;
    }
}
