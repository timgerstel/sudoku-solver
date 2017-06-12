package sudoku;

import static org.junit.Assert.*;

import algorithms.BoardLogic;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import java.util.concurrent.TimeUnit;

public class ABSBTest {
    
    @Rule
    public Timeout global = new Timeout(5000L, TimeUnit.SECONDS);
    
    private ArrayBasedSudokuBoard board, board2;
    
    @Before
    public void before(){
        board = new ArrayBasedSudokuBoard();
       // board2 = new ArrayBasedSudokuBoard(25,1);
    }
    
    @Test
    public void testABSB(){
        assertEquals(3, board.getBlockSize());
        //assertEquals(5, board2.getBlockSize());
    }
    
    @Test
    public void testConsole(){
        board.toConsole();
    }
}
