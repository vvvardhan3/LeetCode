package Math;


public class convertIntegerIntoNonZeroElements {
    public static int[] convert(){
       // List<Integer> list = new ArrayList<>();
        int n = 12;
        for(int i = 1; i< 100000; i++){
            for(int j = i;j< 100000; j++){
                if( n == i + j){
                   return new int[]{i,j};             
                } 
            } 
        }
        return null; 
    }
    public static void main(String[] args) {
        System.out.println(convert());
    }
}
