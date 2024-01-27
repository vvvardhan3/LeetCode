package NeetCode;

public class secondLargest {
    public static void main(String[] args) {
        int[] a = {1,2,1,3,4,5,6};
        int n = a.length;
        int largest = a[0];
        int secondLargest = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]>largest) {
                largest = a[i];
            }
        } 
        System.out.println(largest);

        for (int i = n-2 ; i >= 0; i--) {
            if (a[i] != largest) {
                secondLargest = a[i];
                break;
            }
        }
        System.out.println(secondLargest);




    }
}
