package NeetCode;

public class checkIfSorted {
    public static boolean sorted(){
        int nums[] ={3};
        int n = nums.length;
        int start = nums[0];
        int end = nums[n-1];

        if (end > start) {
            return false;
        } else {

            int largestElement = nums[0];
            int largestElementIndex = 0;
            for (int i = 0; i < n; i++) {
                if (nums[i]>largestElement) {
                    largestElement = nums[i];
                    largestElementIndex = i;
                }
            } 
                System.out.println("Largest element in the array: "+largestElement);
                System.out.println( "Index of Largest element: "+ largestElementIndex);

            for (int i = largestElementIndex -1 ; i >= 0; i--) {
                for (int j = largestElementIndex + 1 ; j < n; j++) {
                    if ((nums[j] < nums[j+1]) && (nums[i] > nums[i-1]) &&
                    (nums[largestElementIndex-1] < nums[largestElementIndex]) && (nums[largestElementIndex + 1] < nums[largestElementIndex])) {
                    // nums[1] > nums[0]
                    return true;
                }    
            }   
        }
        }
        return false;

    }
    public static void main(String[] args) {
        System.out.println("Is sorted:? " + sorted());
        // sorted();
    }
}
