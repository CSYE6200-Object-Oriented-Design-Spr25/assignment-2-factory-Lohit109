package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class ServiceItemFactory {

    // Eagerly created single instance
    private static final ServiceItemFactory instance = new ServiceItemFactory();

    // Private constructor
    private ServiceItemFactory() {
    }

    // Public accessor
    public static ServiceItemFactory getInstance() {
        return instance;
    }

    // Factory method for ServiceItem
    public ServiceItem createItem(String csvLine) {
        return new ServiceItem(csvLine);
    }

    // Helper method to create ALL ServiceItems from a file
    public List<ServiceItem> createAllItems(String filePath) {
        List<ServiceItem> items = new ArrayList<>();
        List<String> lines = FileUtil.readLines(filePath);
        for (String line : lines) {
            items.add(createItem(line));
        }
        return items;
    }
}

