package controller;
import controller.HouseTree;
import model.House;

//Esta clase será la que manejara la logica houseView con HouseTree 
public class HouseController {
    private HouseTree houseTree;
    
    public HouseController() {
        this.houseTree = new HouseTree();
    }

    public boolean addHouse(House house) {
        return houseTree.add(house);
    }
    
    public House searchHouse(int idProperty) {
        return houseTree.search(idProperty);
    }

    public boolean updateHouse(int idProperty, House newHouse) {
        return houseTree.update(idProperty, newHouse);
    }
    public boolean deleteHouse(int idProperty) {
        return houseTree.delete(idProperty);
    }

}
