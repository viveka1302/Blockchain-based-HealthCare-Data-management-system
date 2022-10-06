
package sha512proto;
import java.util.Scanner;
/**
 *
 * @author VIVEK
 */
public class Reciever {
    DataObject di;
    
    public DataObject RecieveInput(){
        int id, age;
        String name;
        String medData[]= new String[5];
        boolean history;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter patient ID:");
        id=  Integer.parseInt(sc.nextLine());
        System.out.print("Enter patient's name: ");
        name= sc.nextLine();
        System.out.println("Enter patient's age:");
        age= Integer.parseInt(sc.nextLine());
        String question[]={"ECG:", "BP:", "Temperature:","Oxygen level:", "Sugar:"};
        for(int i=0; i<5; i++){
            System.out.println("Please enter patient's "+question[i]);
            medData[i]=sc.nextLine();
        }
        System.out.println("Any medical history(True/False):");
        history= sc.nextBoolean();
        
    di= new DataObject(id,name,age,medData, history);  
        return di;
    }
}
