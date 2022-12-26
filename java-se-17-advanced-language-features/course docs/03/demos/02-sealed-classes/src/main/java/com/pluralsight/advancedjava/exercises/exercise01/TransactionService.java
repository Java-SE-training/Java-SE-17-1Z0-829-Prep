/*
 * This code is part of the course "Java SE 17 Advanced Language Features" for Pluralsight.
 *
 * Copyright (C) 2022 by Jesper de Jong (jesper@jdj-it.com).
 */
package com.pluralsight.advancedjava.exercises.exercise01;

import java.math.BigDecimal;
import java.util.List;

/**
 * Exercise 1: Working with sealed classes and interfaces.
 * <p>
 * TODO: First take a look at the instructions on interface Transaction and records Purchase and Refund.
 *       Then implement the calculateNetAmount() method below.
 *       Run the included unit test {@link Exercise01Test} to check if you have done this correctly.
 */
public class TransactionService {

    public BigDecimal calculateNetAmount(List<Transaction> transactions) {
        var netAmount = BigDecimal.ZERO;

        // TODO: Loop over the transactions. For purchase transactions, add the amount to the net amount;
        //       for refund transactions, subtract the amount from the net amount.

        // Optional: If you are using a version of Java that has switch expressions, you can try using a switch expression here.
        // Note that this is available in Java 17 only as a preview feature; you need to enable the use of preview features
        // to be able to use this. More information: https://openjdk.java.net/jeps/406

        return netAmount;
    }
}
