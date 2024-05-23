package Codicionales;

import java.util.Scanner;

public class MayorEdad {
    public static void main(String[] args) {
        Scanner entreda = new Scanner(System.in);

        // Declarar variable
        int edad;

        //capturade datos
        System.out.println("Ingrese su edad");
        edad = entreda.nextInt();

        //operar los valores capturados
        if (edad > 18){
        System.out.println("Eres mayor de edad");
        }
        else {
            System.out.println("Eres menor de edad");
        }

        //mostrar el resultado del procesamiento
        System.out.println();
        System.out.println("tu edad es:" + edad);
    }
}
