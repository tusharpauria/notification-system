package com.example.notification.utils;

import com.example.notification.interfaces.NotificationSender;
import com.example.notification.models.NotificationRecord;

import java.util.ArrayList;
import java.util.List;

public class NotificationManager {

    private final List<NotificationRecord> history = new ArrayList<>();

    public void process(NotificationSender sender, NotificationRecord record) {

        sender.send();
        history.add(record);
    }

    public void showHistory() {

        history.forEach(System.out::println);
    }
}