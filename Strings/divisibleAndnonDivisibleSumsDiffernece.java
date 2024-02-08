package Strings;

public class divisibleAndnonDivisibleSumsDiffernece {
    public static void sum(){
        int n = 10;
        int m = 3;
        int dcount = 0;
        int ndcount = 0;

        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                dcount += i;
                
            } else {
                ndcount += i;
                
            }
        } 
       System.out.println(ndcount - dcount);
    }
    public static void main(String[] args) {
        sum();
    }
}
