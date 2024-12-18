package Materia;
import java.util.Scanner;

import Materia.Controllers.MenuController;
import Materia.Models.Pantalla;
import Materia.Queues.*;
import Materia.Stacks.*;
import Materia.Ejercicio_01_sign.*;
import Materia.Ejercicio_02_sorting.*;
import Materia.Stacks.Stack;


public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        System.out.println("/------------- Validador de Símbolos -------------/");
        
        while (continuar) {
            System.out.print("Ingrese una expresión con paréntesis, corchetes o llaves (o escriba 'salir' para finalizar): ");
            String input = scanner.nextLine(); // Captura la expresión del usuario

            // Permitir salida si el usuario escribe "salir"
            if (input.equalsIgnoreCase("salir")) {
                continuar = false;
                System.out.println("Saliendo del programa...");
                break;
            }

            // Valida la expresión
            boolean resultado = Ejercicio_01.isValid(input); 

            if (resultado) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }

            System.out.println(); 
        }

        
        /*------------------------------------------------------------------------------------------------------------
         * 2DO EJERCICIO
         */

        java.util.Stack<Integer> stack = new java.util.Stack<>(); 

        System.out.println("------------- Ordenador de Stack -------------");
        System.out.print("Ingrese el número de elementos en el stack: ");
        int n = scanner.nextInt();

        System.out.println("Ingrese los elementos del stack:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            stack.push(scanner.nextInt());
        }

        System.out.println("\nStack original: " + stack);

        // Llamada al método ordenarStack desde Ejercicio_02_sorting
        java.util.Stack<Integer> ordenado = Ejercicio_02.ordenarStack(stack);

        System.out.println("Stack ordenado: " + ordenado);
    }
}
        /*runContactManager();
        //runStack();
        //runStackGeneric();
        //runQueue();
        //runQueueGeneric();
    }

    private static void runContactManager(){
        MenuController menuController = new MenuController();
        menuController.showMenu();
    }*/

    

    /*public static void runStack(){
        // Instanciar la clase
        Stack stack = new Stack();

        //
        stack.push(5);
        stack.push(7);
        stack.push(10);
        stack.push(20);

        stack.printStack();
        System.out.println("\nConatidad= "+ stack.getSize());

        System.out.println("Cima   ->"+stack.peek());
        System.out.println("Retirar->"+stack.pop());
        System.out.println("Cima   ->"+stack.peek());
        System.out.println("Retirar->"+stack.pop());
        System.out.println("Cima   ->"+stack.peek());
    }

    public static void runStackGeneric(){
        StackGeneric<Pantalla> router = new StackGeneric<>();
        router.push(new Pantalla(1, "Home Page", "/home"));
        router.push(new Pantalla(1, "Menu Page", "/home/menu"));
        router.push(new Pantalla(1, "User Page", "/home/menu/users"));

        System.out.println("Estoy en: "+ router.peek().getRuta());
        System.out.println("Regreso a: "+((router.popNode().getNext().getValue())).getRuta());
        System.out.println("Estoy en: "+ router.peek().getRuta());

        router.push(new Pantalla(1, "Setting Page", "/home/menu/setting"));

        System.out.println("Pantallas= " + router.getSize());
        System.out.println("Estoy en: " + router.peek().getRuta());
        router.printstakc();
    }

    public static void runQueue(){
        Queue cola = new Queue();
        cola.enqueue(10);
        cola.enqueue(20);
        cola.enqueue(30);
        cola.enqueue(40);

        System.out.println(cola.peek());
        System.out.println(cola.dequeue());
        System.out.println(cola.dequeue());
        System.out.println(cola.peek());
        System.out.println("Tamanio de la cola: "+cola.getSizeQueue());
        cola.printqueue();
    }
    public static void runQueueGeneric(){
        QueueGeneric<Pantalla> colageneric = new QueueGeneric<>();

        colageneric.enqueue(new Pantalla(1, "compu", "/Home"));
        colageneric.enqueue(new Pantalla(1, "compu", "/Home/archivos"));
        colageneric.enqueue(new Pantalla(1, "compu", "/Home/archivos/est"));

        System.out.println(colageneric.peek());
        //System.out.println(colageneric.dequeue());

        System.out.println("Estoy en: "+ colageneric.peek().getRuta());
        System.out.println("Tamanio= "+ colageneric.getSizeQueue());
        colageneric.printqueue();
    } */