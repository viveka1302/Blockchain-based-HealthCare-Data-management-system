
package sha512proto;

import java.io.*;
/**
 *
 * @author VIVEK
 */

public class binserFileGenerator {
 String fileDirectory;
 DataObject di;
 Reciever rr= new Reciever();
 binserFileGenerator(){
        di=rr.RecieveInput();
    
        fileDirectory = System.getProperty("user.dir")+"/tmp/BinaryData.ser";

}
void serailize(){
try{
    try (FileOutputStream fos = new FileOutputStream(fileDirectory)) {
        ObjectOutputStream out= new ObjectOutputStream(fos);
        out.writeObject(di);
        out.close();
        fos.close();
    }
   }
catch(IOException i){
    i.printStackTrace();
    }
    
}   
}
