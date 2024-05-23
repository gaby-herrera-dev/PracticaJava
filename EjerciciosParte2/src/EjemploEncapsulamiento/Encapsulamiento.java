package EjemploEncapsulamiento;

public class Encapsulamiento {
    public static void main(String[] args) {
        //crreacion de objetos y asigancion de estado inicial
        Persona obj = new Persona();
        obj.setNombre();
        obj.setApellido();
        obj.setEdad();

        //obtenerdatos de la propiedad
        System.out.println("Nombre " + getNombre());
        System.out.println("Apellido:" + getApellido);
        System.out.println("Edad:" + getApellido);


    }
}
