package Strings;

public class smallestEvenMultiple {
    public static void small(){
        int n = 6;
        //ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 50; i++) {
            if(i % 2 == 0 && i % n ==0){
                System.out.println(i);
                break;
                //list.add(i);
            }
        }

        //System.out.println(list);
        

    }
    public static void main(String[] args) {
        small();
    }
}
