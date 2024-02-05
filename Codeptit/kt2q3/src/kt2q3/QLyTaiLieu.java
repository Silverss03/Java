/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kt2q3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class QLyTaiLieu {
    List<TaiLieu> list = new ArrayList<>() ;

    public QLyTaiLieu() {
    }
    
    public void nhapSach(){
        Scanner scanner = new Scanner(System.in) ; 
        String regex = "^TL\\d{2}$" ;
        while(true){
            String ma = scanner.nextLine() ;
            if(ma.matches(regex)){
                break ; 
            }
            else{
                System.out.println("Nhap lai!");
            }
            String nxb = scanner.nextLine() ;
            String soban = scanner.nextLine() ;
            String tgia = scanner.nextLine() ; 
            String tensach = scanner.nextLine() ;
            int sotrang = Integer.parseInt(scanner.nextLine()) ;
            Sach tmp = new Sach(ma, nxb, soban, tgia, tensach, sotrang) ; 
            list.add(tmp) ;
        }
    }
    public void nhapTapChi(){
        Scanner scanner = new Scanner(System.in) ; 
        String regex = "^TL\\d{2}$" ;
        while(true){
            String ma = scanner.nextLine() ;
            if(ma.matches(regex)){
                break ; 
            }
            else{
                System.out.println("Nhap lai!");
            }
            String nxb = scanner.nextLine() ;
            String soban = scanner.nextLine() ;
            int thangPH = Integer.parseInt(scanner.nextLine()) ;
            int sotrang = Integer.parseInt(scanner.nextLine()) ;
            TapChi tmp = new TapChi(ma, nxb, soban, thangPH, sotrang) ; 
            list.add(tmp) ;
        }
    }
    public void nhapBao(){
        Scanner scanner = new Scanner(System.in) ; 
        String regex = "^TL\\d{2}$" ;
        while(true){
            String ma = scanner.nextLine() ;
            if(ma.matches(regex)){
                break ; 
            }
            else{
                System.out.println("Nhap lai!");
            }
            String nxb = scanner.nextLine() ;
            String soban = scanner.nextLine() ;
            String ngayPH = scanner.nextLine() ;
            Bao tmp = new Bao(ma, nxb, soban, ngayPH ) ; 
            list.add(tmp) ;
        }
    }
    
    public void out(){
        for(TaiLieu x : list){
            System.out.println(x);
        }
    }
}
