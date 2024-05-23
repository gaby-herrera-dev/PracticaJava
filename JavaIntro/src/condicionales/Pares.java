package condicionales;

import java.util.Scanner;

public class Pares {
    public static void main(String[] args) {
        //instancia de la clase scanner
        Scanner entreda = new Scanner(System.in);

        //declaracion de variable
        int num, residuo;

        //captura de los datos
        System.out.println("Escriba un numero entero");
        num = entreda.nextInt();

        //procesamiento de la informacion
        residuo = num % 2;

        if (residuo == 0)
            System.out.println("El número es par");
        else
            System.out.println("El número es impar");
    }
}
