package sudoku;

import algorithms.BoardLogic;
import structures.ArrayBasedBlock;

import java.util.Random;

/**
 * Created by Tim on 6/5/2017.
 */
public class ArrayBasedSudokuBoard {
    
    private ArrayBasedBlock[][] board;

    //Generate 9x9 Sudoku puzzle
    public ArrayBasedSudokuBoard(){
       board = BoardLogic.newBoard(3);
    }

    //Generate nxn Sudoku puzzle
    public ArrayBasedSudokuBoard(int n){
    
    }

    public void toConsole(){
    
    }

}
