import materia.Stacks.Stack;
import Controllers.MenuController;
import materia.Queues.*;
import materia.Queues.QueueGeneric;
import materia.Stacks.*;
import models.Pantalla;
public class App {
    public static void main(String[] args) throws Exception {
        runContactManager();
        //runStack();
        //runStackGeneric();
        //runQueue();
        //runQueueGeneric();
    }

    private static void runContactManager(){
        MenuController menuController = new MenuController();
        menuController.showMenu();
    }
}