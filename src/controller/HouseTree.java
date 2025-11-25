package controller;
import model.House;
import model.HouseNode;
import java.util.ArrayList;
import java.util.List;

public class HouseTree {
    private HouseNode root;
    



    public HouseTree(){
        this.root = null;
    }
   
    public boolean empty() {
        return root == null;
    }


    public boolean add(House house) {
        if (empty()){
            root = new HouseNode(house);
        }else{
            root = insertRecursive(root, house);
        }
        return true;        
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
        if (empty()){
            return null;
        }else{
            House foundHouse = searchRecursive(root, idProperty);
            return foundHouse;
        }
    }       
    private House searchRecursive(HouseNode current, int idProperty) {
        if (current == null) {
            return null; 
        }
        if (idProperty == current.getInfo().getIdProperty()) {
            return current.getInfo(); 
        }
        return idProperty < current.getInfo().getIdProperty()
            ? searchRecursive(current.getLeft(), idProperty)
            : searchRecursive(current.getRight(), idProperty);
    }
    
    public boolean update(int idProperty, House updatedHouse) {

        House currenthouse = search(idProperty);
        
        if (currenthouse == null){
            return false;
        }
            currenthouse.setUbication(updatedHouse.getUbication());
            currenthouse.setAddress(updatedHouse.getAddress());
            currenthouse.setSquareMeters(updatedHouse.getSquareMeters());
            currenthouse.setRooms(updatedHouse.getRooms());
            return true;
    }

    public boolean delete(int idProperty) {
        if (empty()) {
            return false;
        } else {
            if (search(idProperty) == null) {
                return false;
            }
            root = deleteRecursive(root, idProperty);
            return true;
        }
    } 

    private HouseNode deleteRecursive(HouseNode current, int idProperty) {
        if (current == null) {
            return null;
        }

        if (idProperty < current.getInfo().getIdProperty()) {
            current.setLeft(deleteRecursive(current.getLeft(), idProperty));
        } else if (idProperty > current.getInfo().getIdProperty()) {
            current.setRight(deleteRecursive(current.getRight(), idProperty));
        } else {
            if (current.getLeft() == null && current.getRight() == null) {
                return null;
            } else if (current.getLeft() == null) {
                return current.getRight();
            } else if (current.getRight() == null) {
                return current.getLeft();
            } else {
                HouseNode successor = findMin(current.getRight());
                current.setInfo(successor.getInfo());
                current.setRight(deleteRecursive(current.getRight(), successor.getInfo().getIdProperty()));
            }
        }
        return current;
    }

    private HouseNode findMin(HouseNode node) {
        HouseNode current = node;
        while (current.getLeft() != null) {
            current = current.getLeft();
        }
        return current;
    }

    public List<House> list() {
    List<House> result = new ArrayList<>();
    inOrder(root, result);
    return result;
    }

    private void inOrder(HouseNode current, List<House> result) {
        if (current != null) {
            inOrder(current.getLeft(), result);
            result.add(current.getInfo());
            inOrder(current.getRight(), result);
        }
    }
}
