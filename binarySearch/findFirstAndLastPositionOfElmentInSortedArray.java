package binarySearch;

public class findFirstAndLastPositionOfElmentInSortedArray {
    public static int[] position(){
        int nums[] = {5,7,7,8,8,8,8,10};
        int target = 8;
        int first = -1;
        int last = -1;

        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                if (first == -1) {
                    first = i;
                } last = i;
            } 
        }
        int[] result = new int[]{first,last};
        for (int i : result) {
            System.out.println(i);
        }
        return result;

    }
    public static void main(String[] args) {
        System.out.println(position());
    }
}
