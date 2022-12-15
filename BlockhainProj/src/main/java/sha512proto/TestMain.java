
package sha512proto;

import BlockchainProto.*;
import java.io.IOException;
import java.sql.Timestamp;

/**
 *
 * @author VIVEK
 */
public class TestMain {
    public static void main(String args[]) throws IOException{
       /* binserFileGenerator bsfg= new binserFileGenerator();
        bsfg.serailize();
        TestReadSer tsr= new TestReadSer();
        tsr.printsertest();
        BinaryDataFromSer bdfs= new BinaryDataFromSer();
        String binData= bdfs.SerBin();
        */
        MongoCon mGc= new MongoCon();
        MainChain mc= new MainChain();
        mc.printMap();
        Timestamp ts= mGc.makeEntry(mc.getDataChain());
        
    }
}
