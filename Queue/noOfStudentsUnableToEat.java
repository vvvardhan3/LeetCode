package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class noOfStudentsUnableToEat {
    public static int students(){
        int[] students = {1,1,0,0};
        int[] sandwiches = {0,1,0,1};

        Queue<Integer> student =  new LinkedList<>();
        Queue<Integer> sandwich =  new LinkedList<>();

        for (Integer integer : students) {
            student.add(integer);
        }
        
        for (Integer integer : sandwiches) {
            sandwich.add(integer);
        }

        int count = 0;
        while(!sandwich.isEmpty()){
            if (count > students.length) {
                break;
            }

            if (student.peek() == sandwich.peek()) {
                student.remove();
                sandwich.remove();
                count = 0;
            } else {
                student.add(student.remove());
                count++;
            }
        }

       return student.size();

        
    }
    public static void main(String[] args) {
       System.out.println( students());
    }
}
