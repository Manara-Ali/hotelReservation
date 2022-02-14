package model;

public class FreeRoom extends Room {

    // Instance methods

    // Constructor
    public FreeRoom(Double price) {
        super.price = 0.0d;
    }

    // Methods

    // Getters and Setters


    // To string method
    @Override
    public String toString() {
        return "FreeRoom{" +
                "roomNumber='" + roomNumber + '\'' +
                ", price=" + price +
                ", enumeration=" + enumeration +
                '}';
    }
}
