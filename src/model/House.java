package model;

public class House {
    private int idProperty;
    private String ubication;
    private String address;
    private int squareMeters;
    private byte rooms;

    public int getIdProperty() {
        return idProperty;
    }
    public void setIdProperty(int idProperty) {
        this.idProperty = idProperty;
    }
    public String getUbication() {
        return ubication;
    }
    public void setUbication(String ubication) {
        this.ubication = ubication;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getSquareMeters() {
        return squareMeters;
    }
    public void setSquareMeters(int squareMeters) {
        this.squareMeters = squareMeters;
    }
    public byte getRooms() {
        return rooms;
    }
    public void setRooms(byte rooms) {
        this.rooms = rooms;
    }
    
    public House() {
    }
    
    public House(int idProperty, String ubication, String address, int squareMeters, byte rooms) {
        this.idProperty = idProperty;
        this.ubication = ubication;
        this.address = address;
        this.squareMeters = squareMeters;
        this.rooms = rooms;
    }
}
