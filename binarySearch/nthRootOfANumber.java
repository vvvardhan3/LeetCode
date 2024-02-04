package binarySearch;

public class nthRootOfANumber {
    public static int root(){
        int n = 9;
        int m = 1953125;

        double nthRoot = Math.pow(n, n);
        System.out.println(nthRoot);
        if (nthRoot == m) {
            return n;
        } else {
            return -1;
        }
    }
    public static void main(String[] args) {
        System.out.println(root());
    }
}
