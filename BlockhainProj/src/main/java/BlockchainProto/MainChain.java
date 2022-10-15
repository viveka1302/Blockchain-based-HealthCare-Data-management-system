
package BlockchainProto;

import java.util.HashMap;

/**
 *
 * @author VIVEK
 */
public class MainChain {
   public static void main(){
    HashMap<String,Object[]> dataChain;
       dataChain = new HashMap<String,Object[]>();
    String[] med1={"120","90","100"};
    Block genesisBlock;
       genesisBlock = new Block(0, 1, "Vivek", 19, med1);
    dataChain.put(genesisBlock.getName(), genesisBlock.getMapValue());
    
   }
}