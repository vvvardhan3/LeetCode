package Array;

public class numberofEmployeesWhoMettheTarget {
    public static int target(){
        int[] hours = {0,1,2,3,4};
        int target = 2;
        int count = 0;

        for (int i : hours) {
            if ( i >= target) {
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        System.out.println(target());
    }
}
