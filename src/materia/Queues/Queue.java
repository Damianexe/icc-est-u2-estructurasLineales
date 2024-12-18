package Materia.Queues;
import java.util.NoSuchElementException;

import Materia.Modelos.*;
public class Queue {

    private Node front; //nodo al frente de la cola
    private Node rear; //nodo al final de la cola
    private int size = 0;

    public Queue(){
        this.front = null;
        this.rear = null;
    }

    //Meotodo para encolar nodos
    public void enqueue (int value){
        Node newNode = new Node(value);
        if(isEmpty()){
            front = newNode;
            rear = newNode;
        } else {
            rear.setNext(newNode);
            rear = newNode;
        }
        size++;
    }

    // Desencolar el nodo
    public Node dequeue(){
        if(isEmpty()){
            throw new NoSuchElementException("La cola esta vacia");
        }
        Node node = front;
        front = front.getNext();
        if(front == null){
            rear = null;
        }
        size--;
        return node;
    }

    // devuelve la cabesa de la cola pero no lo saca
    public Node peek(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        return front;
    }

    public boolean isEmpty(){
        return  front == null;
    }

    //el tamanio de la cola
    public int getSizeQueue(){
        return size;
    }

    //inprimir todos los elementos de la cola
    public void printqueue(){
        Node current = front;
        while(current != null){
        System.out.print(current.getValue()+" - ");
        current = current.getNext();
        }
    }
}