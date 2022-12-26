/*
 * This code is part of the course "Java SE 17 Advanced Language Features" for Pluralsight.
 *
 * Copyright (C) 2022 by Jesper de Jong (jesper@jdj-it.com).
 */
package com.pluralsight.advancedjava.exercises.exercise01;

import com.pluralsight.advancedjava.exercises.Customer;

import java.util.List;

/**
 * Exercise 1: Convert a method that may return null to a method that uses Optional.
 */
public class Exercise01 {

    // TODO: The method below finds a Customer in a list of customers by e-mail address.
    //       If there is no customer with the specified e-mail address, it returns null.
    //       Rewrite this method to return an Optional of Customer.
    //       It should return an empty Optional if there was no customer with the specified e-mail address.
    //       Run the included unit test {@link Exercise01Test} to check if you have done this correctly.
    public static Customer findCustomerByEmailAddress(List<Customer> customers, String emailAddress) {
        for (Customer customer : customers) {
            if (customer.emailAddress().equals(emailAddress)) {
                return customer;
            }
        }
        return null;
    }
}
