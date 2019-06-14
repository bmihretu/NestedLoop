public class Nestedloop {
    public static void main(String [] args){
        String line = " ";
        for(int i = 1; i < 100; i++){
            for(int j = 0; j < i; j++){
                line = line + i;
            }
            System.out.println(line);
            line = " ";
        }
    }
}