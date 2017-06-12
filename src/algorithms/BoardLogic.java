package algorithms;

import java.util.stream.IntStream;

public class BoardLogic {
    
    /** Class can be used after an ArrayBasedSudokuBoard has been initialized **/
    
    private static int[][] board;
    
    public BoardLogic(int[][] board){
        this.board = board;
    }
    
    //Generates a new blank board
    //Args: block size = sqrt(n)
    //Returns blank sudoku board
    public static boolean isFull(){
        for(int[] row : board){
            if(IntStream.of(row).anyMatch(x -> x == 0)){
                return false;
            }
        }
        return true;
    }
    
    private static int[][] fillBoard(double n) {
        int[][] b = board;
        return b;
    }
    
    public static int getBlockSize(){
        return (int) Math.sqrt(board[0].length);
    }
    //Note: make this generate a random, completely correct board then remove numbers based on a difficulty
    public static int[][] newBoard(int n, int difficulty){
        int[][] b = fillBoard(n);
        return b;
    }
}
