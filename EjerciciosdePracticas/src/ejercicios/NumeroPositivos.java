package ejercicios;

import java.util.Scanner;

public class NumeroPositivos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //declarar variable
        int num;

        //capturade datos
        System.out.println("Ingrese un numero");
        num = entrada.nextInt();

        //operar los valores capturados
        for (int i = 0; i >= num; i++) {
            System.out.println(i +" ");
        }

        //mostrar resultado
        System.out.println();
        System.out.println("los numeros son menores " + num);
    }
}
