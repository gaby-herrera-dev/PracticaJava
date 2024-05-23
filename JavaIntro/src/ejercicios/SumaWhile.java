package ejercicios;

import java.util.Locale;
import java.util.Scanner;

public class SumaWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //declarar variables
        double num1, num2, suma;
        boolean detener = false;

        while(detener == false) {
            //capturade datos
            System.out.println("Escriba el primer número");
            num1 = Double.parseDouble(entrada.next());

            System.out.println("Escriba el segundo número");
            num2 = entrada.nextDouble();

            //operar los valores capturados
            suma = num1 + num2;


            //mostrar el resultado del procesamiento
            System.out.println();
            System.out.println("La suma de los números es: " + suma);

            String respuesta = entrada.next().toLowerCase();
            if (respuesta.equals("s"))
                detener = true;
        }
    }
}
