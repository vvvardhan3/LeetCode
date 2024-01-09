package Day05;


import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class mergeTwoSortedLists {
    public static void lists(){
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        System.out.println("Original List: " + list);
        Collections.sort(list);
        System.out.println("Sorted list: "+list);
        List<Integer> list1 = new LinkedList<>();
        list1.add(3);
        list1.add(1);
        list1.add(2);
        System.out.println("Sorted list1: " + list1);
        Collections.sort(list1);
        System.out.println("Sorted List1: " + list1);
        list.addAll(list1);
        System.out.println("Merged list: " + list);
        Collections.sort(list);
        System.out.println("Sorted Merged List: " + list);
    }
    public static void main(String[] args) {
        lists();
    }
}
