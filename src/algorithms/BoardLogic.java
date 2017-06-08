package algorithms;

import structures.ArrayBasedBlock;

public class BoardLogic {
    
    private static int BLOCK_SIZE;
    
    //Generates a new blank board
    //Args: block size = sqrt(n)
    //Returns blank sudoku board
    private static ArrayBasedBlock[][] blankBoard(double n) {
        BLOCK_SIZE = (int) Math.sqrt(n);
        ArrayBasedBlock[][] board = new ArrayBasedBlock[BLOCK_SIZE][BLOCK_SIZE];
        for (ArrayBasedBlock[] rows : board) {
            for (ArrayBasedBlock b : rows) {
                b = new ArrayBasedBlock(BLOCK_SIZE);
            }
        }
        return board;
    }
    
    public static ArrayBasedBlock[][] newBoard(int difficulty){
        ArrayBasedBlock[][] board = blankBoard(9);
        return board;
    }
    
    //Note: make this generate a random, completely correct board then remove numbers based on a difficulty
    public static ArrayBasedBlock[][] newBoard(int n, int difficulty){
        ArrayBasedBlock[][] board = blankBoard(n);
        return board;
    }
}
