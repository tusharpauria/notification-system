package com.example.notification.implementations;

import com.example.notification.abstracts.BaseNotification;
import com.example.notification.models.User;

public class PushNotification extends BaseNotification {

    public PushNotification(User user, String message) {
        super(user, message);
    }

    @Override
    public void send() {
        validateMessage();
        log("Sending Push Notification...");
        System.out.println("Push Notification sent to " + user.getName() + " : " + message);
    }
}