package Controllers;

import models.Contact;
import models.LinkedList; // Clase del programa 
import materia.models.NodeGenerico;

public class ContactManager {
    private LinkedList<Contact<?,?>> contacts = new LinkedList<>();

    public ContactManager() {
        this.contacts = new LinkedList<>();
    }

    // Método para agregar un contacto
    public void addContact(Contact contact) {
        contacts.appendToTail(contact);
    }

    // Método para imprimir la lista de contactos
    public void printList() {
        contacts.print();
    }

    public Contact<?, ?> findContactByName(String name) {
        NodeGenerico<Contact<?, ?>> current = contacts.getHead();
        while (current != null) {
            if (((String) current.getValue().getName()).equalsIgnoreCase(name)) {
                return current.getValue();
            }
            current=current.getNext();
            System.out.println(current);
            System.out.println(current.getNext());
        }
        return null;
    }

    public void deleteContactByName(String name) {
        NodeGenerico<Contact<?, ?>> current = contacts.getHead();

        if (current == null)
            return;

        if (((String) current.getValue().getName()).equalsIgnoreCase(name)) {
            contacts.setHead(contacts.getHead().getNext());
            contacts.setSize = (contacts.getSize()-1);
            return;
        }

        //CASO 2 ITERAR EN LA LISTA

        while(current.getNext()!=null){
            if(((String) current.getNext().getValue().getName()).equalsIgnoreCase(name)){
            current.setNext(current.getNext().getNext());
            contacts.setSize = (contacts.getSize()-1);
            return;
            }
            current = current.getNext();
        }
    }
}
