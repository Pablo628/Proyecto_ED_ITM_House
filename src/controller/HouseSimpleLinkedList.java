package controller;
import model.HouseListNode;

public class HouseSimpleLinkedList {
    insertatEnd(house newHouse){
        HouseListNode newNode = new HouseListNode(newHouse);
        if (head == null) {
            head = newNode;
        } else {
            HouseListNode current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    countNodes(int count){
        int count = 0;
        HouseListNode current = head;
        while (current != null) {
            count++;
            current = current.getNext();
        }
        return count;
    }
}
