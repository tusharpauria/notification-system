package com.example.notification.implementations;

import com.example.notification.abstracts.BaseNotification;
import com.example.notification.models.User;

public class EmailNotification extends BaseNotification {

    public EmailNotification(User user, String message) {
        super(user, message);
    }

    @Override
    public void send() {

        validateMessage();
        log("Sending Email...");
        System.out.println("Email sent to " + user.getEmail() + " : " + message);
    }
}