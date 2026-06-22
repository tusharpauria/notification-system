package com.example.notification.abstracts;

import com.example.notification.interfaces.Loggable;
import com.example.notification.interfaces.NotificationSender;
import com.example.notification.markers.Auditable;
import com.example.notification.models.User;

public abstract class BaseNotification implements Loggable, NotificationSender, Auditable {

    protected User user;
    protected String message;

    public BaseNotification(User user, String message) {
        this.user = user;
        this.message = message;
    }

    public void validateMessage() {
        if (message == null || message.isBlank()) {
            throw new IllegalArgumentException("Message cannot be empty.");
        }
    }
}