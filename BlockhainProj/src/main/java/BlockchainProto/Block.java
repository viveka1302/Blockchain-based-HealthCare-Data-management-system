
package BlockchainProto;

import java.util.Arrays;

/**
 *
 * @author VIVEK
 */
public class Block {
    private final int previousHash;
    private final int id;
    private final String name;
    private final int age;
    private final String[] medData;
    private final int blockHash;
    
    /**
     *
     * @param previousHash
     * @param id
     * @param name
     * @param age
     * @param medData
     */
    public Block(int previousHash, int id, String name, int age, String[] medData){

        this.previousHash= previousHash;
        this.id= id;
        this.name=name;
        this.age=age;
        this.medData=medData;
        Object contents[]={id, name, age, medData};
        Object hashArray[]={contents,previousHash};
        this.blockHash=Arrays.hashCode(hashArray);
    }
    public int getBlockHash(){
        return blockHash;
    }
    public int getID(){
        return id;
    }
    public int getPreviousHash(){
        return previousHash;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String[] medData(){
        return medData;
    }
    
    
}
