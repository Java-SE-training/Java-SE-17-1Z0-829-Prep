/*
 * This code is part of the course "Java SE 17 Advanced Language Features" for Pluralsight.
 *
 * Copyright (C) 2022 by Jesper de Jong (jesper@jdj-it.com).
 */
package com.pluralsight.advancedjava.exercises.exercise01;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Exercise 1: This record represents a refund given to a customer for a certain amount, at a certain date and time.
 */
public record Refund(long customerId, BigDecimal amount, LocalDateTime dateTime) implements Transaction {
}
