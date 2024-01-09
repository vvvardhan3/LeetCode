// Firt recurring Character/element
package Day09;

public class firstRecurringCharacter {
    /*
     * 1,2,3,4,1,2,3,5,4 --> 1
     * 2,1,1,2,3,4,3,4,6 --> 2
     */

    public static void recurring(){
        int[] array = {1,2,3,4,1,2,3,5,4};

        if (array.length > 1) {
            for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = i +1; j < array.length; j++) {
                if (array[i] == array[j] ) {
                    count++;
                    break;
                }
            }
            if (count == 1) {
                System.out.println("Recurring Element is: " + array[i]);
                break;
            } else {
                if (count == 0) {
                    System.out.println("Undefined!");
                    break;
                }
            }
        } 
        } else {
            System.out.println("Array is Empty!");
        }
            
    }

    public static void main(String[] args) {
        recurring();
    }

    
}
