package condicionales;

import java.util.Scanner;

public class CalculadoraSwitch {
    public static void main(String[] args) {

        //instancia de la clase scanner
        Scanner entrada = new Scanner(System.in);
        double num1, num2, result = 0;
        boolean error = false;
        char opc;

        System.out.println("Escriba el primero numero");
        num1 = entrada.nextDouble();


        System.out.println("Escriba el sugundo numero");
        num2 = entrada.nextDouble();

        System.out.println("Escriba el numero de la operacion: +,-, *, /");
        opc = entrada.next().charAt(0);

        switch (opc) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                error = true;
                System.out.println("Error, operacion invalida");
                return;

        }
        if(!error){
            System.out.println();
            System.out.println("El resultado de la operacion es:" + result);

        }
    }
}
