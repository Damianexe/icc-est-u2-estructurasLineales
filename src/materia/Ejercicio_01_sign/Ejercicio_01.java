package Materia.Ejercicio_01_sign;

import java.util.Stack;
import java.util.Queue;
/*
 * Implementar un algoritmo que determine si un string que solo contiene los caracteres '(', ')', '{', '}', '[' y ']' es
válido.
Los corchetes abiertos se cierran en el orden correcto, por ejemplo:
• Ejemplo 1:
o Input: "([]){}"
o Output: true
• Ejemplo 2:
o Input: "({)}"
o Output: false
 */
 
 public class Ejercicio_01 {
     public static boolean isValid(String s) {
        Stack <Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c); // Apila los símbolos de apertura
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop(); // Desapila si hay correspondencia
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop(); // Desapila si hay correspondencia
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop(); // Desapila si hay correspondencia
            } else {
                return false; // Caso inválido
            }
        }
    
        return stack.isEmpty(); // Si la pila está vacía, es válido
    }

}