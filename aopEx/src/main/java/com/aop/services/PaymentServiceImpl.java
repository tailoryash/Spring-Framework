package com.aop.services;

public class PaymentServiceImpl implements PaymentService{
    @Override
    public void makePayment(int amount) {
        //payment code
        System.out.println(amount + " : Amount debited");
        //
        //
        //

        System.out.println(amount + " : Amount Debited");
    }
}
