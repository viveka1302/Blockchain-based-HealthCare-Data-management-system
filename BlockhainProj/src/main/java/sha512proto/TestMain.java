
package sha512proto;

import BlockchainProto.*;
import java.io.IOException;

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
        MyBackgroundMethod mbm= new MyBackgroundMethod();
        mbm.setDaemon(true);
        mbm.start();
        MainChain mc= new MainChain();
        mc.printMap();
        
        
    }
}
