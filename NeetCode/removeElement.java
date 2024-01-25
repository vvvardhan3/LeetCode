package NeetCode;

import java.util.*;

public class removeElement {
    public static void element(){
        int[] nums = {3,2,2,3};
        int val = 3;
        LinkedList<Integer> list = new LinkedList<>();
        int count = 0;
        for (Integer integer : nums) {
            if (integer != val) {
                list.add(integer);
                count++;
            }
        }
        System.out.println(list);
        System.out.println(count); 
       
    }
    public static void main(String[] args) {
        element();
    }
}
