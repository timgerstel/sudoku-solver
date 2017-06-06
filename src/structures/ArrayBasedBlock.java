package structures;

/**
 * Created by Tim on 6/5/2017.
 */
public class ArrayBasedBlock {

    private int[][] block;

    public ArrayBasedBlock(){
        block = new int[3][3];
    }

    public ArrayBasedBlock(int n){
        block = new int[n][n];
    }

    public int[][] getBlock(){
        return block;
    }
}
