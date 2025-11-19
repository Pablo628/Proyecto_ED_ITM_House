package model;

public class house {
    private int idProperty;
    private String ubication;
    private String addres;
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
    public String getAddres() {
        return addres;
    }
    public void setAddres(String addres) {
        this.addres = addres;
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
    
    public house() {
    }
    
    public house(int idProperty, String ubication, String addres, int squareMeters, byte rooms) {
        this.idProperty = idProperty;
        this.ubication = ubication;
        this.addres = addres;
        this.squareMeters = squareMeters;
        this.rooms = rooms;
    }
}
