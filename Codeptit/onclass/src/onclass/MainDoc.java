/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onclass;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class MainDoc {
    public static void main(String[] args){
        String name = "sv.dat" ;
        List<SinhVien> ls = new ArrayList<>() ;
        try{ 
            BufferedReader br = new BufferedReader(new FileReader(name)) ;
            String line = "" ;
            while((line = br.readLine()) != null){
                String[] a= line.split("\\s+") ;
                ls.add(new SinhVien("B21DCCN666", "Unknow")) ;
            }
        }
        catch(Exception e){
            
        }
    }
}
