package model;

public class Room implements IRoom{
    // Instance variables
    String roomNumber;
    Double price;
    RoomType enumeration;

    // Default constructor
    public Room() {};

    // Contract methods
    @Override
    public String getRoomNumber() {
        return "";
    }

    @Override
    public Double getRoomPrice() {
        return 0.0d;
    }

    @Override
    public RoomType getRoomType() {
        return null;
    }

    @Override
    public boolean isFree() {
        return false;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNumber='" + roomNumber + '\'' +
                ", price=" + price +
                ", enumeration=" + enumeration +
                '}';
    }
}
