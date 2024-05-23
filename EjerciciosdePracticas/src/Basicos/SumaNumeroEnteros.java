package Basicos;

import java.util.Scanner;

public class SumaNumeroEnteros {
    public static void main(String[] args) {
        Scanner  entreda = new Scanner(System.in);

        //declarar variables
        double num1, num2, resultado;

        //capturade datos
        System.out.println("Ingrese primer numero ");
        num1 = entreda.nextDouble();
        System.out.println("Ingrese segundo número");
        num2 = entreda.nextDouble();

        //operar los valores capturados
        resultado = num1 + num2;

        //mostrar el resultado del procesamiento
        System.out.println();
        System.out.println("El sedultado de la suma es :" + resultado);


    }
}
