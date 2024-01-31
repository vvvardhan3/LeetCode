package NeetCode;

public class maximumCountOfPositiveNegativesInArray {
    public static void count(){
        int[] nums = {5,20,66,1314};
        int PosCount = 0;
        int NegCount = 0;
        int MaxCount = 0;

        for (int i : nums) {
            if (i > 0) {
                PosCount++;
            }
        }

        for (int i : nums) {
            if (i < 0) {
                NegCount++;
            }
        }

        MaxCount = Math.max(PosCount, NegCount);

        System.out.println(MaxCount);
    }
    public static void main(String[] args) {
        count();
    }
}
