package Materia.Views;

import java.util.Scanner;

public class ConsoleView {

    private Scanner scanner;

    public ConsoleView(){
        this.scanner= new Scanner(System.in);
    }

    public void displayMenu(){
        System.out.println("Contact Manager Menu");
        System.out.println("1. Add contact");
        System.out.println("2. Find COntact");
        System.out.println("3. Delete Contact");
        System.out.println("4. Print Contacts");
        System.out.println("5. Exit");
        System.out.println("Choose an option");

    }

    public String getInput(String prompt){
        System.out.println("*"+prompt);
        return scanner.nextLine();
    }

    public void showMessage(String message){
        System.out.println(message);
    }

}
