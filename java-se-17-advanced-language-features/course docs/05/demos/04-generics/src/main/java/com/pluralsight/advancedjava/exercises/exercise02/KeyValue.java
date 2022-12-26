/*
 * This code is part of the course "Java SE 17 Advanced Language Features" for Pluralsight.
 *
 * Copyright (C) 2022 by Jesper de Jong (jesper@jdj-it.com).
 */
package com.pluralsight.advancedjava.exercises.exercise02;

import java.util.function.Function;

/**
 * Exercise 2: Generic methods.
 */
public record KeyValue<K, V>(K key, V value) {

    // TODO: Add a generic 'mapValue' method.
    //  This method must take a Function that it calls on the value of this KeyValue, and it must return a new KeyValue
    //  with the same key as this KeyValue, and the result of applying the Function to the value as the value.
    //  Hints:
    //  - The method must be an instance method (not a static method)
    //  - The method must be generic (it must have one type parameter)
    //  - Think carefully about what the return type of the method should be
    //  - Think carefully about what the type of the parameter of the method should be
    //  - The implementation is simple; it should create and return a new KeyValue with the appropriate key and value
    //  Run the included unit test Exercise02Test to check if you have done this correctly.
}
