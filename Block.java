import java.util.Arrays;

public class Block {
    
    private int previousHash;
    private String[] transactions;

    private int blockHash;

    public Block (int previousHash, String[] transactions) {
        this.previousHash = previousHash;
        this.transactions = transactions;
        //this.blockHash = calculateHash();

        //If I change anything in the previous block, those changes 
        //will be reflected in the current block. 

        Object[] contents = {Arrays.hashCode(transactions)}; 
        this.blockHash = Arrays.hashCode(contents);
        
    }

    public int getPreviousHash() {
        return previousHash;
    }

    public String[] getTransactions() {
        return transactions;
    }

    public int getBlockHash() {
        return blockHash;
    }
}
