package ejercicios;

import java.util.Scanner;

public class NúmeroMayor {
    public static void main(String[] args) {
        //instancia de la clase scanner
        Scanner entreda = new Scanner(System.in);

        //declaracion de variable
       double num1, num2, num3;
       double numMayor = 0;

        //captura de los datos
        System.out.println("Escriba un numero");
        num1 = entreda.nextInt();
        System.out.println("Escriba un numero");
        num2 = entreda.nextInt();
        System.out.println("Escriba un numero");
        num3 = entreda.nextInt();

        //operar los valores capturados
        if(num1 == num2 || num1 == num3 || num2 == num3) {
            System.out.println("no mame los numeros se repiten");
            return;
        }

        if (num1 > num2 && num1 > num3)
            numMayor = num1;
        else if (num2 > num1 && num2 > num3)
            numMayor = num2;
        else
            numMayor = num3;

        //mostrar el resultado
        System.out.println();
        System.out.println("el mayor es:" + num1 + "," + num2 + "," + num3 + "es:");
        System.out.println(numMayor);





    }
}
