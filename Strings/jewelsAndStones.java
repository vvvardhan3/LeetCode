package Strings;

public class jewelsAndStones {
    public static void stones(){
        String jewels = "z";
        char[] c_jewels = jewels.toCharArray();
        String stones = "ZZZZZ";
        char[] c_stones = stones.toCharArray();

        int count = 0;
        for (char j : c_jewels) {
            for (int i = 0; i < c_stones.length; i++) {
                if (j == c_stones[i]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        stones();
    }
}
