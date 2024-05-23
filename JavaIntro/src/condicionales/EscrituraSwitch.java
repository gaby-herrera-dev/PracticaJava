package condicionales;

import java.awt.*;
import java.util.Scanner;

public class EscrituraSwitch {
    public static void main(String[] args) {

        //instancia de la clase scanner
        Scanner entreda = new Scanner(System.in);

        //declaracion de variable
        int num;
        String dia = "";

        //captura de los datos
        System.out.println("Escriba los nuúmeros entre 1 y 7");
        num =entreda.nextInt();


         //evaluar las codiciones
        switch (num){
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Lunes";
                break;
            case 3:
                dia = "Martes";
                break;
            case 4:
                dia = "Miércoles";
                break;
            case 5:
                dia ="Jueves";
                break;
            case 6:
                dia = "Viernes";
                break;
            case 7:
                dia = "Sábado";
                break;
            default:
                System.out.println("Ingrese un valor valido");
                return;
        }

        if(!dia.equals("")){
            System.out.println();
            System.out.println("El dia de la semana es:" + dia);
        }
    }
}
