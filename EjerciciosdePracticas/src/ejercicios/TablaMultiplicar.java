package ejercicios;

import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //declarar varible
        int num, resultado;

        //capturade datos
        System.out.println("Ingrese un numero");
        num = entrada.nextInt();

        //operar los valores capturados
        System.out.println("la tabla de multiplicar:");
        int i = 1;
        while(i <= 10){
            resultado = num * i;


            //mostrar el resultado del procesamiento
            System.out.println();
            System.out.println("la tabal de multiplicar es " + resultado);
            i++;
        }


    }
}
