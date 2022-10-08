
package sha512proto;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.Integer;
import java.math.BigInteger;

/**
 *
 * @author VIVEK
 */
public class BinaryDataFromSer {
    String fileDirectory=System.getProperty("user.dir")+"/tmp/BinaryData.ser";
    
    public String SerBin() throws FileNotFoundException, IOException{
        FileInputStream fis= new FileInputStream(fileDirectory);
        byte[] Bytedata= fis.readAllBytes();
        int value = new BigInteger(Bytedata).intValue();
        String Bindata= Integer.toBinaryString(value);
        System.out.println(Bindata);
        return Bindata;
        
    }
    
    
}
