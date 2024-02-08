package Strings;

public class maximum69Numbers {
    public static void maximum(){
        int num = 6969;
        String s = String.valueOf(num); 
        char[] c = s.toCharArray();


        for(int i =0; i<c.length;i++){
            if(c[i]=='6'){
              c[i] ='9';
              break;
            }
        }
        
        // s = s.replaceFirst("6", "9");
        // System.out.println(Integer.parseInt(s));

    }
    public static void main(String[] args) {
        maximum();
    }
}
