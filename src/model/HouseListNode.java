package model;

public class HouseListNode {
    private House info;
    private HouseListNode next;

    public House getInfo() {
        return info;
    }

    public void setInfo(House info) {
        this.info = info;
    }

    public HouseListNode getNext() {
        return next;
    }

    public void setNext(HouseListNode next) {
        this.next = next;
    }

    public HouseListNode(House info) {
        this.info = info;
        this.next = null;
    }
}
