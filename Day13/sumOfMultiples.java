/* Java Program to find the sum of all integers in the range [1, n] 
inclusive that are divisible by 3, 5, or 7. */

package Day13;

public class sumOfMultiples {
    public static void multiples(){
        int start = 1;
        int end = 15;
        int multipleOfThree = 3;
        int multipleOfSeven = 7;
        int multipleOfFive = 5;

        int sum = 0;

        for (int i = start; i <= end ; i++) {
            if (i % multipleOfThree == 0 || i % multipleOfFive == 0 || i % multipleOfSeven == 0  ) {
                sum = sum + i;
                
            }
        }
        System.out.println("sum: " + sum);

        // for (int i = start; i <= end ; i++) {
        //     if (i % multipleOfFive == 0 ) {
        //         sum = sum + i;
                
        //     }
        // }
        // System.out.println("sum: " + sum);

        // for (int i = start; i <= end ; i++) {
        //     if (i % multipleOfSeven == 0 ) {
        //         sum = sum + i;
                
        //     }
        // }

        // System.out.println("sum: " + sum);
    }
    public static void main(String[] args) {
        multiples();
    }
}
