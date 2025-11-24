package model;

public class HouseNode {
    private House info;
    private HouseNode left;
    private HouseNode right;

    public House getInfo() {
        return info;
    }

    public void setInfo(House info) {
        this.info = info;
    }

    public HouseNode getLeft() {
        return left;
    }

    public void setLeft(HouseNode left) {
        this.left = left;
    }

    public HouseNode getRight() {
        return right;
    }

    public void setRight(HouseNode right) {
        this.right = right;
    }

    public HouseNode(House info) {
        this.info = info;
        this.left = null;
        this.right = null;
    }
    
}
