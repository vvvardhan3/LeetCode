package Math;

public class sqrtofX {
    public static int sqrt(){
        int x = 9;
        if (x == 0 || x == 1)
            return x;
        int i = 1, result = 1;

        while (result <= x) {
            i++;
        result = i * i;
    }
        return i - 1;
    }
    public static void main(String[] args) {
        System.out.println(sqrt());
    }
}
