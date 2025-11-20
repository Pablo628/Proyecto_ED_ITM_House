package controller;
import model.House;
import model.HouseNode;

public class HouseTree {
    private HouseNode root;

    public boolean add(House house) {
        // TODO: implement add logic
        return false;
    }

    private HouseNode insertRecursive(HouseNode current, House house) {
        if (current == null) {
            return new HouseNode(house);
        }

        if (house.getIdProperty() < current.getInfo().getIdProperty()) {
            current.setLeft(insertRecursive(current.getLeft(), house));
        } else if (house.getIdProperty() > current.getInfo().getIdProperty()) {
            current.setRight(insertRecursive(current.getRight(), house));
        }
        return current;
    }

    public House search(int idProperty) {
        // TODO: implement search logic
        return null;
    }

    public boolean update(int idProperty, House newHouse) {
        // TODO: implement update logic
        return false;
    }

    public boolean delete(int idProperty) {
        // TODO: implement delete logic
        return false;
    }

}
