package ejercicios;

import java.util.Scanner;

public class TablaMultiplicarFor {
    public static void main(String[] args) {
        Scanner entreda = new Scanner(System.in);
        int num, producto;

        System.out.println("Ingrese un numeronatural");
        num = entreda.nextInt();
        for(int i = 1; i <= 10; i++){
            producto = num * i;
            System.out.println(num + "x" + i + "=" + producto );

        }

    }
}
