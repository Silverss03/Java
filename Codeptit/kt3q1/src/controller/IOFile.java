package controller;

import java.io.File;
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
    public static<T> List<T> doc(String file){
        List<T> ls = new ArrayList<>()   ; 
        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file)) ;
            ls = (List<T>)ois.readObject() ;
            ois.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
        catch(ClassNotFoundException e){
            System.out.println(e);
        }
        return ls ;
    }
    public static<T> void ghi(String file, List<T> ls){
        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file)) ;
            oos.writeObject(ls);
            oos.close();
        }
        catch(IOException e){
            
        }
    }
}
