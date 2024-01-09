// remove element from the array
package Day08;

import java.util.LinkedList;
import java.util.List;

public class removeElement {
    public static void element(){
        int[] nums = {0,1,2,2,3,0,4,2};
        int[] value = {2};

        List<Integer> list1 = new LinkedList<>();

        for (Integer integer : value) {
            list1.add(integer);
        }
        

        List<Integer> list = new LinkedList<>();

        for (int i : nums) {
            list.add(i);
        }

        list.removeAll(list1);

        System.out.println(list);
    }
    public static void main(String[] args) {
        element();
    }
}
