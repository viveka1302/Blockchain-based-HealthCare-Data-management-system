
package sha512proto;

import java.io.*;
/**
 *
 * @author VIVEK
 */

public class binserFileGenerator {
 String fileDirectory;
 DataObject di;
 binserFileGenerator(){
    String arr[]={"ECG 98","BP 120/76", "TEMP 99.1", "OXYGEN: 93%", "SUGAR: 77"};
    di= new DataObject(902,"Vivek",73,arr, false);  

/*binserFileGenerator(){
    
    di.identity = 082;
    di.name="Algebra Prasad";
    di.age=74;
    di.medData={"ECG 98", "BP: 120/87", "temp:99.1", "Oxygen: 93%", "Sugar: 77"};
    di.history= false;
    }*/


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
