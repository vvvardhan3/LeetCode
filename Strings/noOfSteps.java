package Strings;

public class noOfSteps {
    public static void steps(){
        int n = 12;
        int count = 0;
        while (n > 0) {
            if (n%2 == 0) {
                n = n/2;
            } else {
                n = n-1;
            }
            count++;
        } 

        System.out.println(count);
    }
    public static void main(String[] args) {
        steps();
    }
}
