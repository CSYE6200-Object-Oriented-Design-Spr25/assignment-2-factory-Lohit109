package edu.neu.csye6200;

public class ElectronicItem extends Item {

    private int warrantyMonths; // additional field for ElectronicItem

    // Constructor using a CSV string
    // Example of CSV string: "201,Smartphone,699.99,24"
    public ElectronicItem(String csv) {
        String[] tokens = csv.split(",");
        if(tokens.length < 4) {
            throw new IllegalArgumentException("Invalid CSV for ElectronicItem: " + csv);
        }
        this.id = Integer.parseInt(tokens[0].trim());
        this.name = tokens[1].trim();
        this.price = Double.parseDouble(tokens[2].trim());
        this.warrantyMonths = Integer.parseInt(tokens[3].trim());
    }

    public int getWarrantyMonths() {
        return warrantyMonths;
    }
    

    @Override
    public String toString() {
        return "ElectronicItem{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", price=" + price +
               ", warrantyMonths=" + warrantyMonths +
               '}';
    }
}

