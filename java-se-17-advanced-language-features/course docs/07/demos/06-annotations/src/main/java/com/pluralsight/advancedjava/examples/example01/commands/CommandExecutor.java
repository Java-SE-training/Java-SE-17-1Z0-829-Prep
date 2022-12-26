/*
 * This code is part of the course "Java SE 17 Advanced Language Features" for Pluralsight.
 *
 * Copyright (C) 2022 by Jesper de Jong (jesper@jdj-it.com).
 */
package com.pluralsight.advancedjava.examples.example01.commands;

import com.pluralsight.advancedjava.examples.example01.SessionState;
import com.pluralsight.advancedjava.examples.example01.UserInput;

public interface CommandExecutor {

    void execute(SessionState sessionState, UserInput userInput);
}
