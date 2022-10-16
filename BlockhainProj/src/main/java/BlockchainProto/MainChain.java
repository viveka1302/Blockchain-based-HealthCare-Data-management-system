
package BlockchainProto;

import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * @author VIVEK
 */
public class MainChain {

    private final HashMap<Integer,Object[]> dataChain;
    private int index;
    /**
     *Constructor to initialize a Genesis Block.
     */
    public MainChain()
    {
    this.index=0;
    dataChain = new HashMap<>();
    String[] med1={"0","0","0"};
    Block genesisBlock;
       genesisBlock = new Block( this.index, 0, 1, "XYZ", 0, med1);
    dataChain.put(genesisBlock.getID(), genesisBlock.getMapValue());
    System.out.println("At Genesis block: "+Arrays.deepToString(dataChain.get(1)));
   }

    /**
     *can be called innumerable times to add next block to the blockchain
     */
    public void nextBlock(int previousHash, int id, String name, int age, String[] medNext){
        this.index= this.index+1;
        
    }
    
}