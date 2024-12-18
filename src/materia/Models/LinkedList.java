package Materia.Models;

import Materia.Modelos.*;

public class LinkedList<T> {

    // Variables
    private NodeGenerico<T> head; // referencia del primer nodo
    private int size = 0;         // Contador del número de nodos
    public int setSize;

    // Constructor vacío
    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    // Getters y Setters
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

    //Metodo que imprime la lista de Contactos
    public void print() {
        NodeGenerico<T> current = head;
        while (current != null) {
            System.out.println(current.getValue());
            current=current.getNext();
        }
    }

}