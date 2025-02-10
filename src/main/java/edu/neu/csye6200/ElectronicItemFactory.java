package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class ElectronicItemFactory {

    private static ElectronicItemFactory instance; // initially null

    // Private constructor to prevent instantiation
    private ElectronicItemFactory() {
    }

    // Public method to get the instance (lazy initialization)
    public static ElectronicItemFactory getInstance() {
        if (instance == null) {
            instance = new ElectronicItemFactory();
        }
        return instance;
    }

    // Factory method to create a single ElectronicItem from a CSV line
    public ElectronicItem createItem(String csvLine) {
        return new ElectronicItem(csvLine);
    }

    // Helper method to create ALL ElectronicItems from a given file
    public List<ElectronicItem> createAllItems(String filePath) {
        List<ElectronicItem> items = new ArrayList<>();
        List<String> lines = FileUtil.readLines(filePath);
        for (String line : lines) {
            items.add(createItem(line));
        }
        return items;
    }
}

