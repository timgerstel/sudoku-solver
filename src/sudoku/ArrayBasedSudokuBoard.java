package sudoku;

import algorithms.BoardLogic;
import structures.ArrayBasedBlock;

import java.util.Random;

/**
 * Created by Tim on 6/5/2017.
 */
public class ArrayBasedSudokuBoard {
    
    private ArrayBasedBlock[][] board;
    //Matrix to store all numbers played in the game, i.e. a number played block row 1 col 3 would be at position matrix index [0][8]
    private int[][] positionMatrix;
    private final int DEFAULT_SIZE = 9;

    //Default constructor
    public ArrayBasedSudokuBoard(){
        //Generate 9 x 9 sudoku board with difficult 1
       board = BoardLogic.newBoard(1);
       positionMatrix = new int[DEFAULT_SIZE][DEFAULT_SIZE];
    }

    //Generate nxn Sudoku puzzle
    public ArrayBasedSudokuBoard(int n, int difficulty){
        board = BoardLogic.newBoard(n, difficulty);
        positionMatrix = new int[n][n];
    }

    public void toConsole(){
        for(int i = 0; i < positionMatrix.length; i++){
            for(int j = 0; j < positionMatrix[0].length; j++){
                System.out.print(positionMatrix[i][j]);
            }
            System.out.println(" ");
        }
    }

}
