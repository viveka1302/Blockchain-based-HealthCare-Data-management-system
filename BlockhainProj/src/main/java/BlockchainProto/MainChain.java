
package BlockchainProto;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author VIVEK
 */
public final class MainChain {

    private final HashMap<Integer,Object[]> dataChain;
    private int index;
    private Timestamp timestamp;
    
    /**
     *Constructor to initialize a Genesis Block.
     */
    @SuppressWarnings("empty-statement")
    
    public MainChain()
    {
    Scanner sc= new Scanner(System.in);
    this.index=0;
    //dataChain is the Blockchain as a whole data structure.
    dataChain = new HashMap<>();
    String[] med1={"0","0","0"};
    //1st block in the chain
    Block genesisBlock;
       genesisBlock = new Block( this.index, 0, 1, "XYZ", 0, med1, null);
    //inserting genesisBlock in dataChain.
    dataChain.put(genesisBlock.getIndex(), genesisBlock.getMapValue());
    System.out.println("At Genesis block: "+Arrays.deepToString(dataChain.get(0)));
    
    //Input for every next block.
    while(true){
    Object[] valMap;
        valMap = dataChain.get(this.index);
    String med_next[]=new String[3];
    int id_next, age_next;
    String name_next;
    System.out.print("ID:");
    id_next=Integer.parseInt(sc.nextLine());
    System.out.println("Name:");
    name_next=sc.nextLine();
    System.out.print("Age: ");
    age_next=Integer.parseInt(sc.nextLine());
    String input_question[]={"BP: ","Pulse: ","Oxygen Level: "};
    for(int i=0; i<3; i++){
        System.out.print(input_question[i]);
        med_next[i]=sc.nextLine();
    }
    timestamp = new Timestamp(System.currentTimeMillis());
    int check;
        check = nextBlock(valMap[1].toString(),id_next,name_next,age_next, med_next, timestamp);
    if(check==1)
        System.out.println("Block added successfully.");
    else{
        System.out.println("Block not added.");
        continue;
    }
    System.out.println("Enter 1 to input next block, 0 to exit");
    int exit_feature;
        exit_feature=Integer.parseInt(sc.nextLine());
    if(exit_feature == 1){
        continue;
    }
    else if(exit_feature==0){
        break;
    }
    }
   }

    /**
     *can be called innumerable times to add next block to the blockchain
     * @param previousHash
     * @param id
     * @param name
     * @param age
     * @param medNext
     * @return dNext
     */
    private int nextBlock(String previousHash, int id, String name, int age, String[] medNext, Timestamp ts){
        if(previousHash==dataChain.get(this.index)[1]){
            return 0;
        }
        this.index= this.index+1;
        int preHash= Integer.parseInt(previousHash);
        Block newBlock;
        newBlock = new Block(this.index,preHash, id, name, age, medNext, ts);
        dataChain.put(newBlock.getIndex(), newBlock.getMapValue());
        return 1;
    }
    
    public HashMap getDataChain(){
        return dataChain;
    }

    /**
     *Print function
     */
    public void printMap(){
        HashMap<Integer, Object[]> finalData= getDataChain();
        int loopsize=finalData.size();
        for(int i=1; i<loopsize; i++){
            System.out.println(Arrays.deepToString(finalData.get(i)));
        }
    }
}