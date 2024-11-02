package org.example;


public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        if (name == null || name.trim().isEmpty()) return false; // Дополнительная проверка на null и пустую строку

        String trimmedName = name.trim();
        int spaceCount = trimmedName.length() - trimmedName.replace(" ", "").length();

        return trimmedName.length() >= 3 && trimmedName.length() <= 19 &&
                spaceCount == 1 &&
                !trimmedName.startsWith(" ") &&
                !trimmedName.endsWith(" ");
    }
}