package com.example.notification.models;

public final class NotificationConfig {

    private final String applicationName;

    public NotificationConfig(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getApplicationName() {
        return applicationName;
    }
}