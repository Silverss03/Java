/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onclass;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class MainGhi {
    public static void main(String[] args){
        List<SinhVien> ls = new ArrayList<>() ;
        ls.add(new SinhVien("B21DCCN515", "Manh Nguyen")) ; 
        ls.add(new SinhVien("B21DCCN517", "Mai Nguyen")) ; 
        File obj = new File("sv.dat") ;
        try{
            Scanner n = new Scanner(obj) ;
            PrintWriter pr = new PrintWriter("sv.dat") ;
            for(int i = 0 ; i < ls.size() ; i++){
                pr.print(ls.get(i));
            }
            pr.print(ls.get(ls.size() - 1));
            pr.close();
        }
        catch(Exception e){
            
        }
    }
}
