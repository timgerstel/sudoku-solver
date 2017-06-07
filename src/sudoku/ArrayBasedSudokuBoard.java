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

    //Generate 9x9 Sudoku puzzle
    public ArrayBasedSudokuBoard(){
       board = BoardLogic.newBoard(3);
       positionMatrix = new int[9][9];
    }

    //Generate nxn Sudoku puzzle
    public ArrayBasedSudokuBoard(int n){
    
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
