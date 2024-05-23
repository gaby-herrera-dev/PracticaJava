package pilares;

public class EjemploEncapsulamiento {
    public static void main(String[] args) {
        //creación de objeto y asignacion de estado inicial

        Persona obj = new Persona();
        //creación de objeto y llenado de sus propiedades
        Persona obj2 = new Persona("Gabriel", "Herrera", 19, "Femenino", 145, 150);

        //Llenado de propiedades a través de mpetodo set
        obj.setNombre("Gaby");
        obj.setApellido("Herera");
        obj.setEdad(20);
        obj.setGenero("Femenino");
        obj.setPeso(160);
        obj.setTalla(155);

        //lectura de valoralmacenado en las propiedades a través del mmétodo get
        System.out.println("El objecto contiene la siguiente información");
        System.out.println("Nombre:" +obj.getNombre());
        System.out.println("Apellido:" +obj.getApellido());
        System.out.println("Edad:" +obj.getEdad());
        System.out.println("Genero:" +obj.getGenero());
        System.out.println("Peso:" +obj.getPeso());
        System.out.println("Estatura:" +obj.getTalla());


        //Llamada al metodo que muestre informacion
        obj2.mstrarInfo();


    }
}
