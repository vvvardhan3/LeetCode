package Strings;

public class valueOfVariable {
    public static int variable(){
        String[] operations = {"X++","++X","++X","X--"};
        int count = 0;

        for (String s : operations) {
            if (s.equals("--X")  || s.equals("X--")) {
                count = count -1;
            } else if (s.equals("++X") || s.equals("X++")){
                count = count + 1;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        System.out.println(variable());
    }
}
