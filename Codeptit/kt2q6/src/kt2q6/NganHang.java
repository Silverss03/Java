/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kt2q6;

import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class NganHang implements ChucNang{
    List<GiaoDich> list ;
    public NganHang(){
        list = new ArrayList<>() ;
        GDVang v = new GDVang("1/1/2022", 100, 10, "24k") ;
        v.setId();
        list.add(v) ;
        v = new GDVang("12/10/2023", 200, 20, "9999") ;
        v.setId(); 
        list.add(v) ;
        GDTT t = new GDTT("13/09/2022", 100, 10, 1, "VND") ;
        t.setId() ;
        list.add(t) ;
    }

    @Override
    public void NhapGDVang(Scanner in) {
        String date = in.nextLine() ;
        double price = Double.parseDouble(in.nextLine()) ;
        int amount = Integer.parseInt(in.nextLine()) ;
        String type = in.nextLine() ; 
        GDVang tmp = new GDVang(date, price, amount, type) ;
        tmp.setId();
        list.add(tmp) ;
    }

    @Override
    public void NhapGDTT(Scanner in) {
        String date = in.nextLine() ; 
        double price = Double.parseDouble(in.nextLine()) ;
        int amount = Integer.parseInt(in.nextLine()) ;
        String currency = in.nextLine() ;
        double ex_rate ;
        if(currency.equalsIgnoreCase("vnd")){
            ex_rate = 1 ; 
        }
        else{
            ex_rate = Double.parseDouble(in.nextLine()) ;
        }
        GDTT tmp = new GDTT(date, price, amount, ex_rate, currency) ;
        tmp.setId();
        list.add(tmp) ;
    }

    @Override
    public void out() {
        for(GiaoDich x : list){
            System.out.println(x);
        }
    }

    @Override
    public void sua(String id) {
        Scanner scanner = new Scanner(System.in) ;
        boolean check = false ; 
        for(int i = 0 ; i < list.size() ; i++){
            if(list.get(i).getId().equalsIgnoreCase(id)){               
                System.out.println(list.get(i));
                check = true ;
                if(list.get(i).getId().charAt(0) == 'V'){
                    GDVang tmp = (GDVang)list.get(i) ;
                    tmp.setId();
                    tmp.setDate(scanner.nextLine());
                    tmp.setPrice(Double.parseDouble(scanner.nextLine()));
                    tmp.setAmount(Integer.parseInt(scanner.nextLine()));
                    tmp.setType(scanner.nextLine());
                    System.out.println("sua thanh cong");
                }
                else{
                    GDTT tmp = (GDTT)list.get(i ); 
                    tmp.setId() ;
                    tmp.setDate(scanner.nextLine());
                    tmp.setPrice(Double.parseDouble(scanner.nextLine())) ;
                    tmp.setAmount(Integer.parseInt(scanner.nextLine()));
                    String currency = scanner.nextLine() ;
                    double ex_rate ;
                    if(currency.equalsIgnoreCase("vnd")){
                        ex_rate = 1 ; 
                    }
                    else{
                        ex_rate = Double.parseDouble(scanner.nextLine()) ;
                    }
                    tmp.setCurrency(currency);
                    tmp.setEx_rate(ex_rate);
                    System.out.println("sua thanh cong");
                }
            }
        }
        if(check == false){
            System.out.println("Khong tim thay");
        }
    }

    @Override
    public void xoa(String id) {
        boolean check = false ;
        for(GiaoDich x : list){
            if(x.getId().equalsIgnoreCase(id)){
                check = true ;
            }
        }
        if(check == false){
            System.out.println("Thay dau ma xoa");
        }
        else{
            for(int i = 0 ; i < list.size() ; i++){
                if(list.get(i).getId().equalsIgnoreCase(id)){
                    list.remove(i) ;
                }
            }
            System.out.println("Xoa thanh cong!!");
        }
    }

    @Override
    public void timTheoLoaiVang(String type) {
        List<GDVang> g_list = new ArrayList<>() ;
        boolean check = false ;
        for(GiaoDich x : list){
            if(x instanceof GDVang){
                g_list.add((GDVang) x) ;
            }
        }
        for(GDVang y : g_list){
            if(y.getType().equalsIgnoreCase(type)){
                check = true ;
                System.out.println(y);
            }
        }
        if(check == false){
            System.out.println("Khong tim thay");
        }
    }

    @Override
    public void timGDVangTuGiaDenGia(double from, double to) {
        int k = 0 ;
        for(GiaoDich x : list){
            if(x.getPrice() >= from && x.getPrice() <= to){
                System.out.println(x);
                k++ ;
            }
        }
        if(k == 0){
            System.out.println("Khong tim thay");
        }
    }
    

}
