package Strings;

public class truncateString {
    public static void truncate(){
        String s = "Hello how are you Contestant";
        int k = 4;
        StringBuffer result = new StringBuffer();
        String[] cf = s.split(" ");
        
        for (int i = 0; i < cf.length; i++) {
            if (i<k) {
                result.append(cf[i]);
                result.append(" ");
            }
        }

        System.out.println(result.toString().trim());
    }
    public static void main(String[] args) {
        truncate();
    }
}
