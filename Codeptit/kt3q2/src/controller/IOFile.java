/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.* ; 

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
    public static<T> void ghi(String file, List<T> ls){
        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file)) ;
            oos.writeObject(ls);
            oos.close() ;
        }
        catch(IOException e){
            
        }
    }
}
