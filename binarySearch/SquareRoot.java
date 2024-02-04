package binarySearch;

public class SquareRoot {
    public static int square(){
        long num = 36;
        double square = Math.sqrt(num);
        double floorValue = Math.floor(square);
        

        if (square - floorValue == 0) {
            return (int) square;
        } else {
            return (int) floorValue;
        }

        
        
    }
    public static void main(String[] args) {
        square();
    }
}
