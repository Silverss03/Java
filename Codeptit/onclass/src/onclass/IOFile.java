/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onclass;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class IOFile {
    public static <T> List<T> doc(String fname){
        List<T> list = new ArrayList<>() ; 
        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fname)) ;
            list =(List<T>) ois.readObject() ;
            ois.close() ;
        }
        catch(IOException e){
            
        }
        catch(ClassNotFoundException e1){
            
        }
        return list ;
    }
    public static <T> void ghi(String fname, List<T> list){
        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fname)) ;
            oos.writeObject(list);
            oos.close();
        }
        catch(IOException e){
            
        }
    }
}
