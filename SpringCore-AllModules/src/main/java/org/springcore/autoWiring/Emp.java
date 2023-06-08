package org.springcore.autoWiring;

public class Emp {
    @Override
    public String toString() {
        return "Emp{" +
                "address=" + address +
                '}';
    }

    private Address address;

    public Emp() {
    }

    public Emp(Address address) {
        this.address = address;
        System.out.println("Inside constructor");
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
