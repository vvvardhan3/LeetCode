package Strings;

public class perfectSquare {
    public static void perfect(){
        int[] array = new int[10];
        int j = 0;
        for (int i = 1; i < array.length; i++) {
            array[j++] = i * i;
        }
        for (int i : array) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        perfect();
    }
}
