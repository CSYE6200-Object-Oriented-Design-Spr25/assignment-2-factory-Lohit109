package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Store extends AbstractStore {

    @Override
    public void demo() {
        // 1. Create lists of items from CSV using the factories
        FoodItemFactory foodFactory = new FoodItemFactory();
        List<FoodItem> foodItems = foodFactory.createAllItems("src/main/resources/FoodItemCSV.txt");

        ElectronicItemFactory electronicFactory = ElectronicItemFactory.getInstance();
        List<ElectronicItem> electronicItems = electronicFactory.createAllItems("src/main/resources/ElectronicItemCSV.txt");

        ServiceItemFactory serviceFactory = ServiceItemFactory.getInstance();
        List<ServiceItem> serviceItems = serviceFactory.createAllItems("src/main/resources/ServiceItemCSV.txt");

        // Combine all items into a single list of the superclass type Item
        List<Item> allItems = new ArrayList<>();
        allItems.addAll(foodItems);
        allItems.addAll(electronicItems);
        allItems.addAll(serviceItems);

        // 2. Sort them by ID (this is the default compareTo in Item)
        System.out.println("=== Sort by ID (default) ===");
        Collections.sort(allItems); // uses compareTo by id
        for (Item i : allItems) {
            System.out.println(i);
        }

        // 3. Sort them by Name
        System.out.println("\n=== Sort by Name ===");
        Collections.sort(allItems, Comparator.comparing(Item::getName));
        for (Item i : allItems) {
            System.out.println(i);
        }

        // 4. Sort them by Price
        System.out.println("\n=== Sort by Price ===");
        Collections.sort(allItems, Comparator.comparing(Item::getPrice));
        for (Item i : allItems) {
            System.out.println(i);
        }
    }
}
