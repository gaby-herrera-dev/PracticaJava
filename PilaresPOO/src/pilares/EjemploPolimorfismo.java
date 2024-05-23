package pilares;

public class EjemploPolimorfismo {
    public static void main(String[] args) {
        //declarar un objeto de la clase prinipal
        Mascota ma;
        // crear un objecto de la classe perro
        ma = new Perro("kaizer", "Negro", "Mediano",
                "Pitbull",15);
        ma.mostrarInformacion();
        ma.comunicarse();
        System.out.println();


        // crear in objecto de la clasegato
        ma = new Gato("Pancho", "Blanco", "Pequeño","Angora", 1);
        ma.mostrarInformacion();
        ma.comunicarse();


    }
}
class Mascota {
    private String nombre;
    private String color;
    private String talla;
    private String raza;

    public Mascota() {
    }


    public Mascota(String nombre, String color, String tamanio, String raza) {
        this.nombre = nombre;
        this.color = color;
        this.talla = tamanio;
        this.raza = raza;
    }


    public void mostrarInformación() {
        System.out.println("Datos de las mascota");
        System.out.println("Nombre: " + nombre);
        System.out.println("Color:" + color);
        System.out.println("Tamaño:" + tamanio);
        System.out.println("Raza" + raza);
    }


    public void comunicarse() {
        System.out.println("Soy una mascota y me comunico asi");
    }
}
        class  Perro extends Mascota {
            private int personaMordidas;

            public Perro() {

            }


            public Perro(String nombre, String color, String tamanio, String raza, int personasMordidas) {
                super(nombre, color, tamanio, raza);
                this.personaMordidas = personasMordidas;
            }

            @Override
            public void comunicarse() {
                System.out.println("Soy un perro y ladro");
            }
        }

        class  Gato extends Mascota {
            private int ratonesCapturados;
        }

          public Gato (){
          }
          public  Gato(String nombre, String color, String tamanio, String raza
                 int ratonesCapturados ){
            super(nombre,color, tamanio,raza);
            this.ratonesCapturados = ratonesCapturados;
          }

          @Override
          public void comunicarse()
          {
              System.out.println("Soy un gato y maullo");
          }







