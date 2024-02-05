/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kt2qt;

import java.time.Year;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Kt2qt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        QuanLy q = new QuanLy() ;
        Scanner in = new Scanner(System.in) ;
        Data d = new Data() ; 
        q.setList(d.getData());
        Boolean thung = Boolean.parseBoolean(in.nextLine()) ;
        q.thongkeXeTai(thung);
    }
    
}
