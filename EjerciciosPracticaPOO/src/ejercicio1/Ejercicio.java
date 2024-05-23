package ejercicio1;

import javax.xml.xpath.XPathFunction;
import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Persona persona = new Persona();
        Futbolista futbolista = new Futbolista();
        Entrenador entrenador = new Entrenador();
        Masajista masajista = new Masajista();


        System.out.println("Hola futbolista ingrese los datos: ");
        System.out.println("ID: ");
        futbolista.id=in.nextInt();
        System.out.println("Nombre: ");
        futbolista.nombre= in .next();
        System.out.println("Apellido: ");
        futbolista.apellido=in.next();
        System.out.println("Edad: ");
        futbolista.edad=in.nextInt();
        System.out.println("Dorsal: ");
        futbolista.dorsal=in.next();
        System.out.println("Dermacacion: ");
        futbolista.demararcacion= in.next();

        System.out.println("\n----Datos del futbolista----" +
                "\nID: "+ futbolista.id+
                "\nNombre: " +futbolista.nombre+
                "\nApellido: " +futbolista.apellido+
                "\nEdad: " +futbolista.edad+
                "\nDorsal: " +futbolista.dorsal+
                "\nDerarcacion: "+futbolista.demararcacion);
        futbolista.concentrarse();
        futbolista.viajar();
        futbolista.jugarPartido();
        futbolista.entrenar();

        System.out.println("\nSoy Entrenador ingrese los datos: ");
        System.out.println("ID: ");
        entrenador.id=in.nextInt();
        System.out.println("Nombre: ");
        entrenador.nombre= in .next();
        System.out.println("Apellido: ");
        entrenador.apellido=in.next();
        System.out.println("Edad: ");
        entrenador.edad=in.nextInt();
        System.out.println("ID Federacion: ");
        entrenador.idFederacion= in.next();

        System.out.println("\n---Datos del entrenador----" +
                "\nID: "+ entrenador.id+
                "\nNombre: " +entrenador.nombre+
                "\nApellido: " +entrenador.apellido+
                "\nEdad: " +entrenador.edad+
                "\nID Federacion: "+entrenador.idFederacion);
        System.out.println();
        entrenador.concentrarse();
        entrenador.viajar();
        entrenador.dirigirEntrenamiento();
        entrenador.dirigirPartido();

        System.out.println("\nHola soy masajista ingrese los datos: ");
        System.out.println("ID: ");
        masajista.id=in.nextInt();
        System.out.println("Nombre: ");
        masajista.nombre= in .next();
        System.out.println("Apellido: ");
        masajista.apellido=in.next();
        System.out.println("Edad: ");
        masajista.edad=in.nextInt();
        System.out.println("Titulacion: ");
        masajista.titulacion= in.next();
        System.out.println("Años de experiencia ");
        masajista.anioExperiencia=in.nextInt();

        System.out.println("----Datos del masajista---" +
                "\nID: "+ masajista.id+
                "\nNombre: " +masajista.nombre+
                "\nApellido: " +masajista.apellido+
                "\nEdad: " +masajista.edad+
                "\nTitulacion: "+masajista.titulacion+
                "\nAños de experiencia : "+masajista.anioExperiencia);
        System.out.println();
        masajista.concentrarse();
        masajista.darMasaje();
        masajista.viajar();


    }
}
class Persona{
    protected int id;
    protected String nombre;
    protected String apellido;
    protected int edad;

    public Persona(){}

    public Persona(int id, String nombre, String apellido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public  void concentrarse(){
        System.out.println("Metodo de la clase padre, concentrarse");
    }

    public void viajar(){
        System.out.println("Metodo viajar de la clase padre");
    }
}

class Futbolista extends Persona{
    protected String dorsal;
    protected String demararcacion;

    public Futbolista(){}

    public Futbolista(int id, String nombre, String apellido, int edad, String dorsal, String demararcacion) {
        super(id, nombre, apellido, edad);
        this.dorsal = dorsal;
        this.demararcacion = demararcacion;
    }

    public void  jugarPartido(){
        System.out.println("El jugador juga partidos ");
    }
    public void entrenar(){
        System.out.println("El jugador entrena");
    }
    //polimorfismo

    @Override
    public void concentrarse(){
        System.out.println("El futbolista se concentra junto al equipo");
    }
    @Override
    public void viajar(){
        System.out.println("El futbolista viaja junto al equipo");
    }

}

class Entrenador extends Persona
{
    protected String idFederacion;

    public Entrenador(){}

    public Entrenador(int id, String nombre, String apellido, int edad, String idFederacion) {
        super(id, nombre, apellido, edad);
        this.idFederacion = idFederacion;
    }
    public void dirigirPartido(){
        System.out.println("El entrenador dirige partidos");
    }
    public void dirigirEntrenamiento(){
        System.out.println("El entrenador  dirige entrenos");
    }
    //polimorfismo

    @Override
    public void concentrarse(){
        System.out.println("El entreador se concentra junto al equipo");
    }
    @Override
    public void viajar(){
        System.out.println("Soy el entrenador y viajo junto al equipo");
    }

}

class Masajista extends Persona{
    protected String titulacion;
    protected int anioExperiencia;

    public Masajista(){}

    public Masajista(int id, String nombre, String apellido, int edad, String titulacion, int anioExperiencia) {
        super(id, nombre, apellido, edad);
        this.titulacion = titulacion;
        this.anioExperiencia = anioExperiencia;
    }

    public void darMasaje(){
        System.out.println("Soy el masajista y doy masajes");
    }
    //polimorfismo
    @Override
    public void concentrarse(){
        System.out.println("Soy el masajista y me concentro junto al equipo");
    }
    @Override
    public void viajar(){
        System.out.println("Soy el masajista y viajo junto al equipo");
    }

}
