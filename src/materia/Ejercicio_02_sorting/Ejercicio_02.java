package Materia.Ejercicio_02_sorting;
import java.util.Scanner;
import java.util.Stack;

public class Ejercicio_02 {

    // Método para ordenar el stack
    public static Stack<Integer> ordenarStack(Stack<Integer> stack) {
        Stack<Integer> aux = new Stack<>();

        while (!stack.isEmpty()) {
            int temp = stack.pop();

            while (!aux.isEmpty() && aux.peek() > temp) {
                stack.push(aux.pop());
            }

            aux.push(temp);
        }

        return aux;
    }

}
