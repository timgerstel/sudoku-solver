package sudoku;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import java.util.concurrent.TimeUnit;

/**
 * Created by Tim on 6/6/2017.
 */
public class ABSBTest {
    
    @Rule
    public Timeout global = new Timeout(5000L, TimeUnit.MILLISECONDS);
    
    private ArrayBasedSudokuBoard board;
    
    @Before
    public void before(){
        board = new ArrayBasedSudokuBoard();
    }
    
    @Test
    public void testConsole(){
        board.toConsole();
    }
}
