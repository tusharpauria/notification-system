package com.example.notification;

import com.example.notification.enums.NotificationType;
import com.example.notification.implementations.EmailNotification;
import com.example.notification.implementations.PushNotification;
import com.example.notification.implementations.SMSNotification;
import com.example.notification.interfaces.NotificationSender;
import com.example.notification.interfaces.PriorityCalculator;
import com.example.notification.models.NotificationConfig;
import com.example.notification.models.NotificationRecord;
import com.example.notification.models.User;
import com.example.notification.utils.NotificationManager;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        NotificationConfig config = new NotificationConfig("Smart Notification System");

        System.out.println(config.getApplicationName());
        Scanner scanner = new Scanner(System.in);
        NotificationManager manager = new NotificationManager();
        User user = new User(1, "Tushar", "tushar@gmail.com", "9876543876");

        PriorityCalculator calculator = msg -> msg.length();
        System.out.print("Enter your message: ");
        String message = scanner.nextLine();
        System.out.println("Priority: " + calculator.calculatePriority(message));
        System.out.println("\nSelect type:");
        System.out.println("1. Email");
        System.out.println("2. SMS");
        System.out.println("3. Push");

        int choice = scanner.nextInt();
        NotificationType type;
        switch (choice) {

            case 1 -> type = NotificationType.EMAIL;
            case 2 -> type = NotificationType.SMS;
            case 3 -> type = NotificationType.PUSH;
            default -> throw new IllegalArgumentException("Invalid choice");
        }

        NotificationSender sender;
        switch (type) {

            case EMAIL -> sender = new EmailNotification(user, message);
            case SMS -> sender = new SMSNotification(user, message);
            default -> sender = new PushNotification(user, message);
        }

        NotificationRecord record = new NotificationRecord(type.name(), message);

        manager.process(sender, record);

        NotificationRecord.AuditInfo audit = new NotificationRecord.AuditInfo();
        System.out.println(audit);
        System.out.println("\nHistory: ");
        manager.showHistory();
        scanner.close();
    }
}