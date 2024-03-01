package binarySearch;

public class kthMissingNumber {
    public static void number(){
        int arr[] = {2,3,4,7,11};
        int k = 5;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= k) {
                k = k + 1;
            }
        }
        System.out.println(k);
    }
    public static void main(String[] args) {
        number();
    }
}
