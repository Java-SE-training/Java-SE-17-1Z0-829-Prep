/*
 * This code is part of the course "Java SE 17 Advanced Language Features" for Pluralsight.
 *
 * Copyright (C) 2022 by Jesper de Jong (jesper@jdj-it.com).
 */
package com.pluralsight.advancedjava.exercises.exercise01;

import java.util.Objects;

/**
 * An implementation of {@link LoggableFormatter} which calls {@link Object#toString()} on the value to be formatted.
 * <p>
 * Note: You do not need to modify this class for the exercise.
 */
public class ToStringLoggableFormatter implements LoggableFormatter {

    @Override
    public String format(Object value) {
        return Objects.toString(value);
    }
}
