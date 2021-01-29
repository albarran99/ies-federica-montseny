public class Alumno {

    private String nombre;
    private String apellidos;
    private String curso;
    private int edad;

    public Alumno(String nombre, String apellidos, String curso, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.curso = curso;
        this.edad = edad;

    }

    public void saludo() {
        System.out.println("Hola me llamo " + nombre + " " + apellidos + " Estudio en " + curso + " Y tengo " + edad);
    }


    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void despedida() {
        System.out.println("Hasta la proxima, Firmado por: " + nombre);
    }

    public int getEdad() {
        return edad;
    }
}

