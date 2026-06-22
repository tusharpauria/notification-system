package com.example.notification.models;

import java.time.LocalDateTime;

public class NotificationRecord {

    private String type;
    private String message;

    public NotificationRecord(String type, String message) {
        this.type = type;
        this.message = message;
    }

    @Override
    public String toString() {
        return "NotificationRecord {" + "type= '" + type + "'" + ", message= '" + message + "'" + '}';
    }

    public static class AuditInfo {

        private final LocalDateTime timestamp;

        public AuditInfo() {
            this.timestamp = LocalDateTime.now();
        }

        @Override
        public String toString() {
            return "Created at: " + timestamp;
        }

    }
}