package structures;

public class ArrayBasedBlock {

    private int[][] block;
    
    //Initialize a new 3 x 3 block as the default
    public ArrayBasedBlock(){
        block = new int[3][3];
    }
    
    //Initialize a new n x n block.  Board size would be n^2 x n^2
    public ArrayBasedBlock(int n){
        block = new int[n][n];
    }

    public int[][] getBlock(){
        return block;
    }
}
