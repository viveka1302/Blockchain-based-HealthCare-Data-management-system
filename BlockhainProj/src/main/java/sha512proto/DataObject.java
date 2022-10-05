/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sha512proto;

/**
 *
 * @author VIVEK
 */
public class DataObject implements java.io.Serializable {
    public int identity;
    public String name;
    public int age;
    public String[] medData= new String[5];
    public boolean history;
    
   DataObject(int id, String n, int a, String med[], boolean x){
    this.identity=id;
    this.name=n;
    this.age=a;
    this.medData=med;
    this.history=x;
}
}
