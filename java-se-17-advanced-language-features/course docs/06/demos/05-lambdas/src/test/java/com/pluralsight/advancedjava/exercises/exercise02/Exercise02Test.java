package com.pluralsight.advancedjava.exercises.exercise02;

import com.pluralsight.advancedjava.exercises.Customer;
import com.pluralsight.advancedjava.exercises.Email;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Exercise 2")
@Order(2)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Exercise02Test {

    private static class TestEmailSender implements Consumer<Email> {
        private final List<Email> emails = new ArrayList<>();

        @Override
        public void accept(Email email) {
            emails.add(email);
        }
    }

    @Test
    @DisplayName("Send mail to customers")
    @Order(1)
    void sendMailToCustomers() {
        var c1 = new Customer(500567L, "Joe Smith", "joe.smith@example.com");
        var c2 = new Customer(923461L, "Susan Jones", "susan.jones@example.com");
        var c3 = new Customer(123974L, "Ann Miller", "miller.a@example.com");
        var c4 = new Customer(234079L, "Derek Baker", "baker123@example.com");

        var emailSender = new TestEmailSender();

        new Exercise02().formatAndSendMail("Welcome to Globomantics", "Hello %s, you get a discount today!", List.of(c1, c2, c3, c4), emailSender);

        // A personalized email has been sent to each customer
        assertThat(emailSender.emails).containsExactly(
                new Email("joe.smith@example.com", "Welcome to Globomantics", "Hello Joe Smith, you get a discount today!"),
                new Email("susan.jones@example.com", "Welcome to Globomantics", "Hello Susan Jones, you get a discount today!"),
                new Email("miller.a@example.com", "Welcome to Globomantics", "Hello Ann Miller, you get a discount today!"),
                new Email("baker123@example.com", "Welcome to Globomantics", "Hello Derek Baker, you get a discount today!"));
    }
}
