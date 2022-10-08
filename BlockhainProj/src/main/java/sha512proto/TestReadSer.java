
package sha512proto;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author VIVEK
 */
public class TestReadSer {
  public void printsertest() throws FileNotFoundException, IOException{
      String fileDirectory=System.getProperty("user.dir")+"/tmp/BinaryData.ser";
  
   ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileDirectory));
int count = 0;
try {
    while (true) {
        count++;
        try {
            Object obj = in.readObject();
            System.out.println("obj #" + count + " is a: " + obj.getClass());
            System.out.println(obj + ".toString(): " + obj);
            
        } catch (ClassNotFoundException e) {
            System.out.println("can't read obj #" + count + ": " + e);
        }
    }
} catch (EOFException e) {
    // unfortunately ObjectInputStream doesn't have a good way to detect the end of the stream
    // so just ignore this exception - it's expected when there are no more objects
} finally {
    in.close();
}
  }
}

