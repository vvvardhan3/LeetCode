package LinkedList;

import java.util.LinkedList;

public class RemoveAllTheDuplicatesFromSortedArray {
    public static void remove(){
        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);

        
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    list.remove(i);
                }
            }
        }

        System.out.println(list);
    }
    public static void main(String[] args) {
        remove();
    }
}
