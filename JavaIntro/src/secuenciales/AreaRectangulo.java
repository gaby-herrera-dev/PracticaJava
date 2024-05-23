package secuenciales;

import java.util.Scanner;

public class AreaRectangulo {
    public static void main(String[] args) {
        Scanner entrada  = new Scanner(System.in);
        //declarar variable

        double base, altura, area;

        //capturade datos
        System.out.println("Escriba la base ");
         base = Double.parseDouble(entrada.next());

         System.out.println("Escriba la altura");
         altura = Double.parseDouble(entrada.next());

        //operar los valores capturados
        area = base * altura;

        //mostrar el resultado del procesamiento
        System.out.println();
        System.out.println("el area del rectangulo: " + area);

    }
}
