package binarySearch;

public class nthRootOfANumber {
    public static int root(){
        int n = 4;
        int m = 69;
        
        for (int i = 1; i < m; i++) {
            if (Math.pow(i, n) == m) {
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
       System.out.println(root());
    }
}
