package BlockchainProto;

import java.sql.Timestamp;
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
    private final Object mapValue[];
    private final int index;
    private final Timestamp time;
    /**
     *
     * @param index
     * @param previousHash
     * @param id
     * @param name
     * @param age
     * @param medData
     * @param time
     */
    public Block(int index, int previousHash, int id, String name, int age, String[] medData, Timestamp time){
        this.index=index;
        this.previousHash= previousHash;
        this.id= id;
        this.name=name;
        this.age=age;
        this.medData=medData;
        this.time= time;
        Object contents[]={this.index,this.id, this.name, this.age, this.medData, this.time };
        Object hashArray[]={contents,previousHash};
        
        this.blockHash=Arrays.hashCode(hashArray);
        Object valOfMap[]={hashArray, this.blockHash};
        this.mapValue=valOfMap;
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
    public String[] getMedData(){
        return medData;
    }
    public Object[] getMapValue(){
        return mapValue;
    }
    public int getIndex(){
        return index;
    }
    
    
}
