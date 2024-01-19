package NeetCode;

import java.util.HashSet;
import java.util.Set;

public class validSudoku {
    public static boolean sudoku(){
        int board[][] = {{7, 9, 2, 1, 5, 4, 3, 8, 6}, 
                         {6, 4, 3, 8, 2, 7, 1, 5, 9},
                         {8, 5, 1, 3, 9, 6, 7, 2, 4},
                         {2, 6, 5, 9, 7, 3, 8, 4, 1},
                         {4, 8, 9, 5, 6, 1, 2, 7, 3},
                         {3, 1, 7, 4, 8, 2, 9, 6, 5},
                         {1, 3, 6, 7, 4, 8, 5, 9, 2},
                         {9, 7, 4, 2, 1, 5, 6, 3, 8},
                         {5, 2, 8, 6, 3, 9, 4, 1, 7}};

        int length = board.length;
        Set<String> seen = new HashSet<>();

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (!seen.add("row" + i + board[i][j]) || !seen.add("col" + j + board[i][j])
                || !seen.add("box" + 3*(i/3) + (j/3) + board[i][j])) {
                    return false;
                }
            } 
        }
        return true; 

    }
    public static void main(String[] args) {
        boolean isValid = sudoku();
        System.out.println("Is the Sudoku board valid? " + isValid);
    }
}
