package mientras.progra2024.src.mientras;
import java.util.Stack;
public class pila_palindromo {
    public static boolean isPalindrome(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        StringBuilder reversedStr = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedStr.append(stack.pop());
        }

        return str.equals(reversedStr.toString());
    }

    public static void main(String[] args) {
        String str = "anitalavalatina";

        if (isPalindrome(str)) {
            System.out.println("La cadena \"" + str + "\" es un palíndromo.");
        } else {
            System.out.println("La cadena \"" + str + "\" no es un palíndromo.");
        }
    }
}
