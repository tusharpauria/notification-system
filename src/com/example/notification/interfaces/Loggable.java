package com.example.notification.interfaces;

public interface Loggable {

    default void log(String message) {
        System.out.println("[LOG] " + message);
    }
}