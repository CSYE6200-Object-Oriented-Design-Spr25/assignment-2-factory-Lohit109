package edu.neu.csye6200;

public class ServiceItem extends Item {

    private int durationHours; // additional field for ServiceItem

    // Constructor using a CSV string
    // Example of CSV string: "301,Consulting,150.0,2"
    public ServiceItem(String csv) {
        String[] tokens = csv.split(",");
        if(tokens.length < 4) {
            throw new IllegalArgumentException("Invalid CSV for ServiceItem: " + csv);
        }
        this.id = Integer.parseInt(tokens[0].trim());
        this.name = tokens[1].trim();
        this.price = Double.parseDouble(tokens[2].trim());
        this.durationHours = Integer.parseInt(tokens[3].trim());
    }

    public int getDurationHours() {
        return durationHours;
    }

    @Override
    public String toString() {
        return "ServiceItem{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", price=" + price +
               ", durationHours=" + durationHours +
               '}';
    }
}

