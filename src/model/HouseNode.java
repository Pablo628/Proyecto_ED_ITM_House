package model;

public class HouseNode {
    private house info;
    private HouseNode left;
    private HouseNode right;

    public house getInfo() {
        return info;
    }

    public void setInfo(house info) {
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

    public HouseNode(house info) {
        this.info = info;
        this.left = null;
        this.right = null;
    }
    
}
