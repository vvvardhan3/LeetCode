package PriorityQueue;

import java.util.PriorityQueue;

public class largestnumAfterParity {
    public static void largestNum() {
        int num = 247;
        char[] numArray = String.valueOf(num).toCharArray();
        PriorityQueue<Integer> even = new PriorityQueue<>((a,b) -> (b-a));
        PriorityQueue<Integer> odd = new PriorityQueue<>((a,b) -> (b-a));

        for (char integer : numArray) {
            int el = integer - '0';
            if (el % 2 == 0) {
                even.offer(el);
            } else {
                odd.offer(el);
            }
        }

        String result = "";

        for (char integer : numArray) {
            int el = integer - '0';
            if (el % 2 == 0) {
                result += (even.poll().toString());

            } else {
                result += (odd.poll().toString());
            }
        }

        System.out.println(Integer.parseInt(result));

    }

    public static void main(String[] args) {
        largestNum();
    }
}
