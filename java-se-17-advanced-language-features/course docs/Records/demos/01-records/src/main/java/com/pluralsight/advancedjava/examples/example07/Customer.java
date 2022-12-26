/*
 * This code is part of the course "Java SE 17 Advanced Language Features" for Pluralsight.
 *
 * Copyright (C) 2022 by Jesper de Jong (jesper@jdj-it.com).
 */
package com.pluralsight.advancedjava.examples.example07;

import static com.pluralsight.advancedjava.examples.Validation.checkThat;

public record Customer(long id, String name, String email) {

    // Compact constructor.
    public Customer {
        checkThat(name != null && !name.isBlank(), "name must not be null or blank");
        checkThat(email != null && !email.isBlank(), "email must not be null or blank");
    }
}
