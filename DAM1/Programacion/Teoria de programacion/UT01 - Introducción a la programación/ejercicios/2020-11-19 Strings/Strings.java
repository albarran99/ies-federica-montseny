public class Strings {

    public static void main(String[] args) {
        String frutas = "frutas: manzana, pera, platano, mandarina";

        String soloFrutas = frutas.substring(7);
        //  manzana, pera, platano, mandarina
        System.out.println(soloFrutas);
        System.out.println(frutas.substring(3, 6));

        String[] frutasArray = soloFrutas.split(",");
        System.out.println("Tengo " + frutasArray.length + " frutas, son estas: ");
        for(String fruta: frutasArray) {
            System.out.println(fruta);
        }

        String abc ="   abcdefg   ";

        for(int i= abc.length() - 1; i >= 0; i--) {
            System.out.print(abc.charAt(i));
        }
        // s.substring()

        // s.startsWith()
        // s.endsWith()
        // s.trim()


        // s.length()
        // s.charAt()
    }
}
