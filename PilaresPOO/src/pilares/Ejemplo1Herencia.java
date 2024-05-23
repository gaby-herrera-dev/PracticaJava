package pilares;

public class Ejemplo1Herencia {
    public static void main(String[] args) {
        //crear un objecto de la clase alumno
        Alumno al = new Alumno("Luis", "Erazo", 20,
                "Masculino", "Caluco","7435-8739","2sgo3",
                "Desarrollo de Software");
        //crear un obejcto de la clase prfesor
        Profesor pr = new Profesor("Gerber", "Gonzalez", 40, "Masculino",
                "Sonzacate", "6509-8649", 800, "7865490-8", "0102030405060",
                "Desarrollo de software");
        //imprimir en consola los datos del objecto al
        System.out.println("Datos del alumno");
        al.mostarInfoAllumno();

        System.out.println();
        System.out.println("Datos del profesor");
        pr.mostrarInfoProfesor();
    }

    }
    class Personas {
        protected String nombre;
        protected String apellido;
        protected int edad;
        protected String genero;
        protected String dirección;
        protected String telefono;


        public Personas(String nombre, String apellido, int edad, String genero, String dirección, String telefono) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.edad = edad;
            this.genero = genero;
            this.dirección = dirección;
            this.telefono = telefono;
        }

        public Personas() {
        }

        public String saludoPersona() {
            return "Este saludo viene desde la clase Persona";
        }
    }
    class  Alumno extends  Personas {
        private String seccion;
        private String carrera;

        public Alumno() {

        }

        public Alumno(String nombre, String apellido, int edad, String genero, String dirección, String telefono, String seccion, String carrera) {
            super(nombre, apellido, edad, genero, dirección, telefono);
            this.seccion = seccion;
            this.carrera = carrera;
        }

        public  String saludoAlumno(){
            return  "Este saludo viene desde la clase alumno";

        }
        public  void mostarInfoAllumno(){
            System.out.println("Nombre del alumno:" + nombre + "" + apellido);
            System.out.println("Edad:"+ edad);
            System.out.println("Genero" + genero);
            System.out.println("Dirección:" + dirección);
            System.out.println("Teléfono:" + telefono);
            System.out.println("Sección:" + seccion);
            System.out.println("Carrera:" + carrera);
        }
    }

class  Profesor extends  Personas{
    private  double sueldo;
    private  String dui;
    private  String nit;
    private  String especialidad;

    public Profesor(String nombre, String apellido, int edad, String genero, String dirección, String telefono, double sueldo, String dui, String nit, String especialidad) {
        super(nombre, apellido, edad, genero, dirección, telefono);
        this.sueldo = sueldo;
        this.dui = dui;
        this.nit = nit;
        this.especialidad = especialidad;
    }

   public  String saludoProfesor(){
        return  " Este saludo viene desde la clase Profesor";

   }
   public void mostrarInfoProfesor (){
       System.out.println("Nombre del profesor:" + nombre + "" + apellido);
       System.out.println("Edad:"+ edad);
       System.out.println("Genero" + genero);
       System.out.println("Dirección:" + dirección);
       System.out.println("Teléfono:" + telefono);
       System.out.println("Sueldo:" + sueldo);
       System.out.println("DUI:" + dui);
       System.out.println("NIT:" + nit);
       System.out.println("Especialidades:" + especialidad);


   }
}






