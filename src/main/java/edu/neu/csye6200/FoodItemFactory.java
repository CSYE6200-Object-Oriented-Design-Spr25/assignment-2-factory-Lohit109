package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class FoodItemFactory {

    // Regular constructor or default constructor is fine here
    public FoodItemFactory() {
    }

    // Factory method to create a single FoodItem from a CSV line
    public FoodItem createItem(String csvLine) {
        return new FoodItem(csvLine);
    }

    // Helper method to create ALL FoodItems from a given file
    public List<FoodItem> createAllItems(String filePath) {
        List<FoodItem> items = new ArrayList<>();
        List<String> lines = FileUtil.readLines(filePath);
        for (String line : lines) {
            items.add(createItem(line));
        }
        return items;
    }
}

