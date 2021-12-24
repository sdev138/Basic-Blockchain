import java.lang.*; 
import java.text.SimpleDateFormat; 
import java.util.*; 


// Hash is digital signature 
// Each block will have  - list of transactions - previous hash - hash


public class App {

    public static int previousHash; 

    Scanner input = new Scanner(System.in);
    
    ArrayList<Block> blockchain = new ArrayList<Block>(); 
    public static void main(String[] args) throws Exception {
        // String[] list1 = {"a", "b", "c"};
        // String[] list2 = {"a", "b", "c"};

        Scanner input = new Scanner(System.in);

        // System.out.println(Arrays.hashCode(list1));
        // System.out.println(Arrays.hashCode(list2));

        String[] genesisTransactions = {"I just created Athanasia"};
        Block genesisBlock = new Block(previousHash ,genesisTransactions);
        System.out.println("Block1 hash code: " + genesisBlock.getBlockHash());

        String[] block1Transactions = {"Holy Shit"};
        Block block1 = new Block(genesisBlock.getBlockHash(), block1Transactions);
        System.out.println("Block2 hash code: " + block1.getBlockHash());

        String[] block2Transactions = {"I am the best"};
        Block block2 = new Block(block1.getBlockHash(), block2Transactions);
        System.out.println("Block3 hash code: " + block2.getBlockHash());

        String[] block3Transactions = {"Between the heavens above and the earth below I alone am the honored one\n"};
        Block block3 = new Block(block2.getBlockHash(), block3Transactions);
        System.out.println("Block4 hash code: " + block3.getBlockHash());

        System.out.println("Enter a message to be added to the blockchain and number of tokens transferred: ");

        //take the input from the user and turn it into an array of strings
        String message = input.nextLine();
        input.close(); 
        String[] messageArray = message.split(" ");
        String[] block4Transactions = new String[messageArray.length + 1];
        Block block4 = new Block(block3.getBlockHash(), block4Transactions);
        System.out.println("Block5 hash code: " + block4.getBlockHash());

        App app = new App();
        app.blockchain.add(genesisBlock);


    }
}
