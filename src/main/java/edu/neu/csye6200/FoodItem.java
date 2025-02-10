package edu.neu.csye6200;

public class FoodItem extends Item {

    private String expirationDate; // additional field for FoodItem

    // Constructor using a CSV string
    // Example of CSV string: "101,Apple,2.99,12/31/2025"
    public FoodItem(String csv) {
        // Split by comma
        String[] tokens = csv.split(",");
        if(tokens.length < 4) {
            throw new IllegalArgumentException("Invalid CSV for FoodItem: " + csv);
        }
        this.id = Integer.parseInt(tokens[0].trim());
        this.name = tokens[1].trim();
        this.price = Double.parseDouble(tokens[2].trim());
        this.expirationDate = tokens[3].trim();
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    @Override
    public String toString() {
        return "FoodItem{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", price=" + price +
               ", expirationDate='" + expirationDate + '\'' +
               '}';
    }
}

