package Materia.Modelos;


public class NodeGenerico<T> {
    private T value;
    private NodeGenerico<T> next;

    //Constructor
    public NodeGenerico(T value) {
        this.value = value;
        this.next = null;
    }

    //Getters and Setters
    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public NodeGenerico<T> getNext() {
        return next;
    }

    public void setNext(NodeGenerico<T> next) {
        this.next = next;
    }

    //To String
    @Override
    public String toString() {
        return "NodeGenerico [value=" + value + ", next=" + next + "]";
    }  


}
