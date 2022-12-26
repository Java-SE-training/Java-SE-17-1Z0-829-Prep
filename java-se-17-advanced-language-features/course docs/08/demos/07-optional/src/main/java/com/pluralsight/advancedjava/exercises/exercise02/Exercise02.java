/*
 * This code is part of the course "Java SE 17 Advanced Language Features" for Pluralsight.
 *
 * Copyright (C) 2022 by Jesper de Jong (jesper@jdj-it.com).
 */
package com.pluralsight.advancedjava.exercises.exercise02;

import com.pluralsight.advancedjava.exercises.Customer;

import java.util.List;

/**
 * Exercise 2: Get the value of an Optional or a default value when the Optional is empty.
 */
public class Exercise02 {

    // TODO: In the list of customers, find the customer with the specified id.
    //       If the customer is found, then return the name of the customer.
    //       If the customer is not found, then return the string "UNKNOWN".
    //       Run the included unit test {@link Exercise02Test} to check if you have done this correctly.
    //
    // Hint: Use streams and Optional to solve this exercise.
    //       To find the Customer in the stream, you'll need to operations to get an Optional<Customer>. Which operations are those?
    //       When you have an Optional, use the appropriate method on it to transform it to the customer's name,
    //       and then another method to get the name or the string "UNKNOWN" if the customer was not found.

    public static String getCustomerName(List<Customer> customers, long customerId) {
        // return customers.stream()...;
        throw new UnsupportedOperationException("Not yet implemented"); // TODO: Replace this line by your solution
    }
}
