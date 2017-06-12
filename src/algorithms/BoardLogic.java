package algorithms;

import structures.ArrayBasedBlock;

import java.util.stream.IntStream;

public class BoardLogic {
    
    private static int BLOCK_SIZE;
    
    //Generates a new blank board
    //Args: block size = sqrt(n)
    //Returns blank sudoku board
    public static boolean isFull(int[][] board){
        for(int[] row : board){
            if(IntStream.of(row).anyMatch(x -> x == 0)){
                return false;
            }
        }
        return true;
    }
    
    private static int[][] fillBoard(int[][] board, double n) {
        BLOCK_SIZE = (int) Math.sqrt(n);
        int[][] b = board;
        while(!isFull(b)){
        
        }
        return b;
    }
    
    public static int getBlockSize(){
        return BLOCK_SIZE;
    }
    
    public static int[][] newBoard(int[][] board, int difficulty){
        int[][] b =  fillBoard(board, 9);
        return b;
    }
    
    //Note: make this generate a random, completely correct board then remove numbers based on a difficulty
    public static int[][] newBoard(int board[][], int n, int difficulty){
        int[][] b = fillBoard(board, n);
        return b;
    }
}
