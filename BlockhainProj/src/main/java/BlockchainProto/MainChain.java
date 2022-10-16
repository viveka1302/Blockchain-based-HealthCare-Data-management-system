
package BlockchainProto;

import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * @author VIVEK
 */
public class MainChain {

    private final HashMap<Integer,Object[]> dataChain;
    /**
     *Constructor to initialize a Genesis Block.
     */
    public MainChain(){
    dataChain = new HashMap<>();
    String[] med1={"0","0","0"};
    Block genesisBlock;
       genesisBlock = new Block(0, 0, 1, "XYZ", 0, med1);
    dataChain.put(genesisBlock.getID(), genesisBlock.getMapValue());
    System.out.println("At Genesis block: "+Arrays.deepToString(dataChain.get(1)));
   }
    
}