package org.springcore.ci;

public class Addition {
    private int a;
    private int b;

    public Addition(double a, double b) {
        this.a = (int) a;
        this.b = (int) b;
        System.out.println("Double constructor");
    }

    public Addition(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Integer constructor");

    }

    public Addition(String a, String b) {
        this.a = Integer.parseInt(a);
        this.b = Integer.parseInt(b);
        System.out.println("String constructor");

    }

    public void doSum(){
        System.out.println("Sum is : " + (this.a + this.b));
    }
}