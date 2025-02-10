package edu.neu.csye6200;

public class Item implements Comparable<Item> {
    protected int id;
    protected String name;
    protected double price;

    public Item() {
        // no-arg constructor
    }

    public Item(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Getters/Setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    /**
     * By default, compare by id for Comparable interface
     */
    @Override
    public int compareTo(Item other) {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Item{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", price=" + price +
               '}';
    }
}
