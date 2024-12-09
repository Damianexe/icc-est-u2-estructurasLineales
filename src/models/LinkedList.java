package models;

import materia.models.*;

public class LinkedList<T> {

    // Variables
    private NodeGenerico<T> head;// referencia del primer nodo
    private int size = 0;// Contador del numero de nodos

    // Constructor
    public LinkedList(NodeGenerico<T> head, int size) {
        this.head = head;
        this.size = size;
    }

    // Getters and Setters
    public NodeGenerico<T> getHead() {
        return head;
    }

    public void setHead(NodeGenerico<T> head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    // Metodos de la clase

    public void appendToTail(T value) {
        NodeGenerico<T> newNode = new NodeGenerico<>(value);
        if (head == null) {
            head = newNode;
        } else {
            NodeGenerico<T> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        size++;
    }

    public void findByValue(T value) {

    }

    public void deleteByValue(T value) {

    }

    public void print() {
        if (head == null) {
            System.out.println("END");
            return;
        }
        NodeGenerico<T> current = head;
        while (current.getNext() != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
        System.out.println("END");
    }

}
