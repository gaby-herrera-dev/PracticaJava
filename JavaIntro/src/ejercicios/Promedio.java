package ejercicios;

import java.util.Scanner;

public class Promedio {
    public static void main(String[] args) {
        //instancia de la clase scanner
        Scanner entrada = new Scanner(System.in);

        //declaracion de variable
        double nota1, nota2, nota3, resultado;

        //captura de los datos
        System.out.println("Escriba la primera nota");
        nota1 = entrada.nextDouble();
        System.out.println("Escriba la segunda nota");
        nota2 = Double.parseDouble(entrada.next());
        System.out.println("Escriba la tercera nota");
        nota3 = Double.parseDouble(entrada.next());

        //operar los valores capturados
        resultado = (nota1 + nota2 + nota3) / 3;

        //mostrar el resultado del procesamiento
        System.out.println();
        System.out.println("el resultado es : " + resultado);


    }
}
