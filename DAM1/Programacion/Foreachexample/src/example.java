public class example {
    public static void main(String[] args){
        int sum = 0;
        int v = 1;
        for(String arg: args){
            int V = Integer.parseInt(arg);
            sum = sum + V;
        }
    }

}
