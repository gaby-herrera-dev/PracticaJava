package Repetitivos;

import java.util.Scanner;

public class SumaDeMenores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Capturar el número ingresado por el usuario
        System.out.println("Ingrese un número entero positivo:");
        int numero = entrada.nextInt();

        // Validar si el número ingresado es positivo
        if (numero <= 0) {
            System.out.println("El número ingresado no es válido.");
            return; // Salir del programa si el número no es válido
        }

        // Declarar una variable para almacenar la suma
        int suma = 0;

        // Calcular la suma de los números naturales utilizando un bucle for
        for (int i = 1; i <= numero; i++) {
            suma += i; // Sumar el valor actual de i a la suma total
        }

        // Imprimir la suma
        System.out.println("La suma de los números naturales hasta " + numero + " es: " + suma);
    }
}
