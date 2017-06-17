package algorithms;

import java.util.ArrayList;
import java.util.List;
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
            System.out.println("CURRENT ROW: " + i);
            for (int j = 0; j < MAX; j++) {
                System.out.println("\nCURRENT COL: " + j);
                int[] moves = getValidMoves(b, i, j);
                int value = (int) (Math.random() * (moves.length - 1)); //generate random value between 1 and max
                b[i][j] = moves[value];
                System.out.println("Random value: " + moves[value]);
            }
        }
        return b;
    }
    
    private static int[] getValidMoves(int[][] board, int row, int col){
        int[] currentMoves = IntStream.rangeClosed(1, board[0].length).toArray();
        int blockRow = row / getBlockSize();
        int blockCol = col / getBlockSize();
        List<Integer> moves = new ArrayList<>();
        //Check row and col
        for(int i = 0; i < board[0].length; i++) {
            if (board[row][i] != 0) {
                currentMoves[board[row][i] - 1] = 0;
            }
            if(board[i][col] != 0){
                currentMoves[board[i][col] - 1] = 0;
            }
        }
        //Check surrounding block
        for(int i = blockRow * getBlockSize(); i < (blockRow + 1) * getBlockSize(); i++){
            for(int j = blockCol * getBlockSize(); j < (blockCol + 1) * getBlockSize(); j++){
                if(board[i][j] != 0) {
                    currentMoves[board[i][j] - 1] = 0;
                }
            }
        }
        for(int i = 0; i < currentMoves.length; i++){
            if(currentMoves[i] != 0){
                moves.add(currentMoves[i]);
            }
        }
        System.out.println("VALID MOVES for board[" + row + "][" + col + "]: " + moves.toString());
        return moves.stream().mapToInt(i->i).toArray();
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
