package Repetitivos;

import java.util.Scanner;

public class SumaNaturales {
    public static void main(String[] args) {

        Scanner entreda = new Scanner(System.in);

        //declarar variable
        int  suma = 0;

        //capturade datos
        System.out.println("Ingrese un n´´umero");
        suma = entreda.nextInt();

        //operar los valores capturados
        for (int i = 1; i <= 100; i++);
        {
            suma += 1;
        }

        //mostrar resultado
        System.out.println();
        System.out.println("la suma de los primeros numero es :" + suma);
    }
}
