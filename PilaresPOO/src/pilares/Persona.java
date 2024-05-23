package pilares;

public class Persona {
    private String nombre;
    private  String apellido;
    private  int edad;
    private  String genero;
    private  double peso;
    private  double talla;

    public void mstrarInfo(){
        System.out.println("La infromación del objeto es:");
        System.out.println("Nombre" + this.nombre + "" + this.apellido);
        System.out.println("Edad"+ this.edad);
        System.out.println("Género" + this.genero);
        System.out.println("Peso" + this.peso);
        System.out.println("talla" + this.talla);
    }


    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, String genero, double peso, double talla) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
        this.peso = peso;
        this.talla = talla;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getTalla() {
        return talla;
    }

    public void setTalla(double talla) {
        this.talla = talla;
    }

    //declarar constructor
    /*public  Persona(){}

    public Persona(String pNombre, String pApellido, int pEdad, String pGenero, double pPeso,
                   double pTalla){
        nombre = pNombre;
        apellido = pApellido;
        edad = pEdad;
        genero = pGenero;
        peso = pPeso;
        talla = pTalla;
    }

    public  String getNombre(){
        return nombre;
    }
    public  void  setNombre(String pNombre){
        nombre = pNombre;
    }*/
}
