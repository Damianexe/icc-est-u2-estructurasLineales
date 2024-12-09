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
            String option = consoleview.getInput("null XD");
            switch (option) {
                case "1":
                    addContact(); {

                }
                    break;
                case "2":
                    findContact(); {

                }
                    break;
                case "3":
                    deleteContact(); {

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

    private void addContact() {
        String name = consoleview.getInput("Enter name");
        String phone = consoleview.getInput("Enter phone");
        Contact<String, String> contact = new Contact<>(name, phone);
        contactManager.addContact(contact);
        consoleview.showMessage("Contact added");

    }

    private void printList() {
        // TODO Auto-generated method stub
        String message = "Unimplemented method 'printList'";
        throw new UnsupportedOperationException(message);
    }

    private void deleteContact() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteContact'");
    }

    private void findContact() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findContact'");
    }

}
