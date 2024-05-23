package repetitivos;

import java.util.Scanner;

public class PromedioFor {
    public static void main(String[] args) {
        Scanner entreda = new Scanner(System.in);
        int num, suma = 0;
        double promedio;

        for(int i = 1; i <= 10; i++){
            System.out.println("Escriba un número[" + i + "]");
            num = entreda.nextInt();
            /*if/num == 0
            break;*/

            suma += num;

        }

        promedio = suma / 10;
        System.out.println();
        System.out.println("El promedio de los números ingresados es : " + promedio);

    }
}
