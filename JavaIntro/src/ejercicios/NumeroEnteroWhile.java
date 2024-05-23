package ejercicios;

import java.util.Scanner;

public class NumeroEnteroWhile {
    public static void main(String[] args) {
        Scanner entreada = new Scanner(System.in);
        int i = 2;
        int num;
        System.out.println("Ingrese el número");
        num = entreada.nextInt();

        while (i <= num ) {
            System.out.println(i);
            //i = i + 1;
            // i += 1;

            i+=2;
        }
    }
}
