package algorithms;

import structures.ArrayBasedBlock;

/**
 * Created by Tim on 6/5/2017.
 */
public class BoardLogic {
    
    //Generates a new blank board
    public static ArrayBasedBlock[][] newBoard(int n){
        ArrayBasedBlock[][] board = new ArrayBasedBlock[n][n];
        for(ArrayBasedBlock[] rows : board){
            for(ArrayBasedBlock b : rows){
                b = new ArrayBasedBlock(n);
            }
        }
        return board;
    }
}
