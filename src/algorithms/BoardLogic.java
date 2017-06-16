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
    public static boolean isFull(int[][] board){
        for(int[] row : board){
            if(IntStream.of(row).anyMatch(x -> x == 0)){
                return false;
            }
        }
        return true;
    }
    
    private static int[][] fillBoard() {
        int[][] b = board;
        int MAX = b[0].length;
        for(int i = 0; i < b.length; i++) {
            System.out.println("Current row: " + i);
            for (int j = 0; j < MAX; j++) {
                int value = (int) (Math.random() * (MAX - 1)) + 1; //generate random value between 1 and max
                boolean foundValid = false;
                while (!foundValid) { //check if move is valid
                    if(isValid(b, value, i, j)){
                        foundValid = true;
                    } else {
                        value = (int) (Math.random() * (MAX - 1)) + 1; //if move is invalid, generate new random value
                    }
                }
                System.out.println("Value for row " + i + " column " + j + ": " + value);
                b[i][j] = value;
                System.out.println("Array value: " + b[i][j]);
            }
            System.out.println("Next row");
        }
        return b;
    }
    
    private static boolean isValid(int[][] board, int value, int row, int col){
        int blockRow = row % getBlockSize();
        int blockCol = col % getBlockSize();
        System.out.println("Check if surrounding block is valid");
        for(int i = blockRow; i < blockRow + getBlockSize(); i++){ //check if block is valid
            for(int j = 0; j < blockCol; j++){
                if(board[i][j] == value){
                    return false;
                }
            }
        }
        System.out.println("Check if Row is Valid");
        for(int val : board[row]){
            if(val == value){
                return false;
            }
        }
        System.out.println("Check if col is valid");
        for(int i = 0; i < board.length; i++){
            if(board[i][col] == value){
                return false;
            }
        }
        return true;
    }
    
    public static int getBlockSize(){
        return (int) Math.sqrt(board[0].length);
    }
    
    //Note: make this generate a random, completely correct board then remove numbers based on a difficulty
    public static int[][] newBoard(int difficulty){
        System.out.println("newBoard: Filling empty board");
        int[][] b = fillBoard();
        return b;
    }
}
