package Controllers;

import materia.models.*;
import models.Contact;
import models.LinkedList; // Importa tu clase personalizada

public class ContactManager {
    private LinkedList<Contact> contacts = new LinkedList<>(); 

    // Método para agregar un contacto
    public void addContact(Contact contact) {
        contacts.appendToTail(contact); 
    }

    // Método para imprimir la lista de contactos
    public void printList() {
        contacts.print(); 
    }
}
