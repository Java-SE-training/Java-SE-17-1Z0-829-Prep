/*
 * This code is part of the course "Java SE 17 Advanced Language Features" for Pluralsight.
 *
 * Copyright (C) 2022 by Jesper de Jong (jesper@jdj-it.com).
 */
package com.pluralsight.advancedjava.exercises.exercise03;

public class Enclosing {

    class Inner {
        void run() {
            System.out.println("Hello from the run() method in the inner class");
        }
    }
}
