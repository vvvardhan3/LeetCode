package Array;

public class detectCapital {
    public static boolean capital(){
        String word = "Flag";

        if (word.equals(word.toUpperCase())) {
            return true;
        } else if(word.equals(word.toLowerCase()))  {
            return true;
        } else if( word.equals(word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase())){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(capital());
    }
}
