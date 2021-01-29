public class Main {
    public static void main(String[] args) {
        Alumno raul = new Alumno("Raul", "Albarran", "1º DAM", 21);
        raul.setEdad(20);

        raul.saludo();
        System.out.println("Tengo " + raul.getEdad());
        raul.despedida();

    }

}
