public class Switch {
        public static void main(String[] args) {
            char c;
            c = ('2');
            switch (c) {
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    System.out.println("El valor de c es numerico");
                    break;
                default:
                    System.out.println("El valor de c no es numerico");
                    break;

            }
        }
    }
