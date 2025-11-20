package controller;
import model.HouseListNode;

// Esta clase manejará una lista enlazada simple de casas y sus operaciones básicas
// como insertar al final y contar nodos.
//Esta clase será utilizada en HouseTree o HouseController si es necesario.
public class HouseSimpleLinkedList {
    insertatEnd(House newHouse){
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
