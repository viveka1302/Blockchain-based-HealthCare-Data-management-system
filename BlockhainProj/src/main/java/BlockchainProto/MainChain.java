
package BlockchainProto;

import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * @author VIVEK
 */
public class MainChain {
   public void chain(){
    HashMap<String,Object[]> dataChain;
       dataChain = new HashMap<String,Object[]>();
    String[] med1={"120","90","100"};
    Block genesisBlock;
       genesisBlock = new Block(0, 1, "Vivek", 19, med1);
    dataChain.put(genesisBlock.getName(), genesisBlock.getMapValue());
    System.out.println("At Vivek: "+Arrays.deepToString(dataChain.get("Vivek")));
   }
}