package com.pluralsight.advancedjava.exercises.exercise02;

import com.pluralsight.advancedjava.exercises.Customer;
import com.pluralsight.advancedjava.exercises.Email;

import java.util.List;

/**
 * Exercise 2: Standard functional interfaces.
 */
public class Exercise02 {

    // TODO: Note that in Exercise 1 we created and used our own functional interface EmailSender. However, we could also have used
    //  one of the standard functional interfaces instead of creating our own.
    //
    // QUESTION: Which standard functional interface from the package java.util.function would be appropriate to use instead of our own interface EmailSender?
    //
    // TODO: Replace the type Object for the emailSender parameter below by the appropriate standard functional interface
    //  and implement the method so that it works just like in Exercise 1.

    public void formatAndSendMail(String title, String content, List<Customer> customers, Object emailSender) {
        // TODO: Copy and paste (and modify if necessary) your solution to Exercise 1 here.

//        customers.stream()
//                .map(...)         // TODO: Map each Customer to an Email with a personalized message. Hint: Use a lambda expression.
//                .forEach(...);    // TODO: Send email by calling the appropriate method of emailSender. Hint: Use a method reference.
    }
}
