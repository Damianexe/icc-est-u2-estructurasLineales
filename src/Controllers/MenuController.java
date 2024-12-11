package Controllers;

import Views.ConsoleView;
import models.Contact;

public class MenuController {

    private ContactManager contactManager;
    private ConsoleView consoleview;

    // Constructor
    public MenuController() {
        this.contactManager = new ContactManager();
        this.consoleview = new ConsoleView();
    }

    public void showMenu() {
        boolean exit = false;
        while (!exit) {
            consoleview.displayMenu();
            String option = consoleview.getInput("null Xd");
            switch (option) {
                case "1":
                    addContact(); {

                }
                    break;
                case "2":
                    findContactByName(); {

                }
                    break;
                case "3":
                    deleteContactByName(); {

                }
                    break;
                case "4":
                    printList(); {

                }
                    break;
                case "5":
                    exit = true;
                    consoleview.showMessage("Exiting");
                    break;
                default:
                    consoleview.showMessage("Invalid Option");
                    break;
            }
        }
    }
    // Metodo que permite añadir un contacto
    private void addContact() {
        String name = consoleview.getInput("Enter name");
        String phone = consoleview.getInput("Enter phone");
        Contact<String, String> contact = new Contact<>(name, phone);
        contactManager.addContact(contact);
        consoleview.showMessage("Contact added");

    }

    //Método que permite imprimir la lista de contactos
    private void printList() {
        consoleview.showMessage("Contact List:");
        contactManager.printList(); // Delegar la impresión al ContactManager
    }

    //Metodo que elimina el contacto seleccionado
    private void deleteContactByName() {
        String name = consoleview.getInput("Enter a name to search");
        contactManager.deleteContactByName(name);
        consoleview.showMessage("Contact Deleted");
    }

    //Metodo que encuentra un contacto
    private void findContactByName() {
        String name= consoleview.getInput("Enter a name to search");
        Contact<?,?> contact = contactManager.findContactByName(name);
        if ( contact != null){
            consoleview.showMessage("Contact found" + contact);
        }else{
            consoleview.showMessage("Contact not found");
        }
    }

}
