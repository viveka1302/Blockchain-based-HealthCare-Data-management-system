/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sha512proto;

import java.io.IOException;

/**
 *
 * @author VIVEK
 */
public class TestMain {
    public static void main(String args[]) throws IOException{
        binserFileGenerator bsfg= new binserFileGenerator();
        bsfg.serailize();
        TestReadSer tsr= new TestReadSer();
        tsr.printsertest();
        BinaryDataFromSer bdfs= new BinaryDataFromSer();
        String binData= bdfs.SerBin();
        
    }
}
