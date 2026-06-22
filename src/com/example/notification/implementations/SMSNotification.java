package com.example.notification.implementations;

import com.example.notification.abstracts.BaseNotification;
import com.example.notification.models.User;

public class SMSNotification extends BaseNotification {

    public SMSNotification(User user, String message) {
        super(user, message);
    }

    @Override
    public void send() {
        validateMessage();
        log("Sending SMS...");
        System.out.println("SMS sent to " + user.getPhone() + ": " + message);
    }
}