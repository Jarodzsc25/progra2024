package mientras.progra2024.src.mientras;

import java.util.Stack;

class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}
public class objeto_persona_pila {
    public static void main(String[] args) {
        Stack<Persona> pilaPersonas = new Stack<>();

        pilaPersonas.push(new Persona("pedro", 33));
        pilaPersonas.push(new Persona("marta", 16));
        pilaPersonas.push(new Persona("esteban", 9));

        System.out.println("Información: ");
        while (!pilaPersonas.isEmpty()) {
            Persona persona = pilaPersonas.pop();
            System.out.println("Nombre: " + persona.getNombre() + ", Edad: " + persona.getEdad());
        }
    }
}
