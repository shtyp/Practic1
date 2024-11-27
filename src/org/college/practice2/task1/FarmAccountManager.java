package org.college.practice2.task1;

import java.util.HashMap;
import java.util.Map;

public class FarmAccountManager {
    private static FarmAccountManager instance;
    private Map<String, String> records;

    private FarmAccountManager() {
        records = new HashMap<>();
    }

    public static synchronized FarmAccountManager getInstance() {
        if (instance == null) {
            instance = new FarmAccountManager();
        }
        return instance;
    }

    public void addRecord(String key, String value) {
        records.put(key, value);
    }

    public String getRecord(String key) {
        return records.getOrDefault(key, "Запис не знайдено");
    }

    public void displayRecords() {
        System.out.println("Облікові дані фермерського господарства:");
        records.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}

