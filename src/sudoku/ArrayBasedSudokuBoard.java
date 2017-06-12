package sudoku;

import algorithms.BoardLogic;
import structures.ArrayBasedBlock;

import java.util.Random;
import java.util.stream.IntStream;

/**
 * Created by Tim on 6/5/2017.
 */
public class ArrayBasedSudokuBoard {
    
    //Matrix to store all numbers played in the game, i.e. a number played block row 1 col 3 would be at position matrix index [0][8]
    private int[][] board;
    private final int DEFAULT_SIZE = 9;
    private int BLOCK_SIZE;

    //Default constructor
    public ArrayBasedSudokuBoard(){
        //Generate 9 x 9 sudoku board with difficult 1
       board = BoardLogic.newBoard(board,1);
       BLOCK_SIZE = 3;
    }

    //Generate nxn Sudoku puzzle
    public ArrayBasedSudokuBoard(int n, int difficulty){
        board = BoardLogic.newBoard(board, n, difficulty);
        BLOCK_SIZE = BoardLogic.getBlockSize();
    }
    
    public int getBlockSize(){
        return BLOCK_SIZE;
    }
    

    public void toConsole(){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                System.out.print(board[i][j]);
            }
            System.out.println(" ");
        }
    }

}
