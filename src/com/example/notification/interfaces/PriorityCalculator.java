package com.example.notification.interfaces;

@FunctionalInterface
public interface PriorityCalculator {

    int calculatePriority(String message);
}