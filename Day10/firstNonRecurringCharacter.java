package Day10;

public class firstNonRecurringCharacter {
        /*
     * 1,2,3,4,1,2,3,5,4 --> 5
     * 2,1,1,2,3,4,3,4,6 --> 6
     * {} --> Array is Empty!
     */

     public static void Nonrecurring(){
        int[] array = {};

        if (array.length > 0) {
            for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] && i != j  ) {
                    count++;
                    break;
                }
                
            } // System.out.println(array[i]+ " : " + count);
            if (count == 0) {
                System.out.println("First Non-Recurring Element is: " + array[i]);
                break;
            }
            }
        } else {
            System.out.println("Array is Empty!");
        }

    }

    public static void main(String[] args) {
        Nonrecurring();
    }


    
}
