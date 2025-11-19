package model;

public class HouseListNode {
    private house info;
    private HouseListNode next;

    public house getInfo() {
        return info;
    }

    public void setInfo(house info) {
        this.info = info;
    }

    public HouseListNode getNext() {
        return next;
    }

    public void setNext(HouseListNode next) {
        this.next = next;
    }

    public HouseListNode(house info) {
        this.info = info;
        this.next = null;
    }
}
