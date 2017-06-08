package structures;

public class ArrayBasedBlock {

    private int[][] block;
    private int block_size;
    
    //Initialize a new n x n block.  Board size would be n^2 x n^2
    public ArrayBasedBlock(int n){
        block = new int[n][n];
        block_size = n;
    }

    public int[][] getBlock(){
        return block;
    }
    
    public int getBlockSize(){
        return block_size;
    }
}
