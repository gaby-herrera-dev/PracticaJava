package ejercicios;

import java.util.Scanner;

public class SolicitarNumerosEnterosWhile {
    public static void main(String[] args) {
        Scanner entreda = new Scanner(System.in);
        int i = 2;
        int num1;
        int num2;
        int  limiteInferior, limiteSuperior;



        System.out.println("Ingrese el  primer  número");
        num1 = entreda.nextInt();
        System.out.println("Ingrese el  segundo número");
        num2 = entreda.nextInt();

        if(num1 > num2) {
            limiteInferior = num2;
            limiteSuperior = num1;
        }
        else {
            limiteInferior = num1;
            limiteSuperior = num2;
        }

        if((limiteInferior %2) == 0)
            i = limiteInferior + 2;
        else
            i = limiteInferior + 1;

        while (i < limiteSuperior) {

            System.out.println(i);
            i+=2;
        }

    }
}
