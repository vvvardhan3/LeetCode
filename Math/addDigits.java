package Math;

public class addDigits {
    public static void digits() {
        int num = 38;
        
        if (num == 0) {
            System.out.println("0");
        } else if (num % 9 == 0) {
            System.out.println("9");
        } else {
            System.out.println(num % 9);
        }

    }

    public static void main(String[] args) {
        digits();
    }
}
