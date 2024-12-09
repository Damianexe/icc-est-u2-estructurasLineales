package Controllers;
import materia.models.*;
import models.Contact;
import java.util.LinkedList;

public class ContactManager {
    private LinkedList<Contact> contacts = new LinkedList<>();

    public void addContact(Contact contact) {
        contacts.appendToTail(contact);
    }

    public void printList() {
        contacts.print();
    }
}
