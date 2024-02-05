/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kt2q2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author Admin
 */
public class QuanLy implements ChucNang{
    List<PTGT> list = new ArrayList<>() ;
    public QuanLy(){
        list = new ArrayList<>();
        Oto v = new Oto("TOYOTA", "2003", 200000000D, "Do", "Dong co xang" , 6);
        v.setMa();
        list.add(v);
        XeMay f = new XeMay("HONDA", "2002", 70000000D, "Den", "8500hp");
        f.setMa();
        list.add(f);
        XeTai t = new XeTai("KIA", "1999", 50000000D, "Den", "20 tan");
        t.setMa();
        list.add(t);
    }

    @Override
    public void NhapOto(Scanner in) {
        String h_regex = "^[a-zA-Z0-9]+$" ;
        String n_regex = "\\d{4}" ;
        String hang, nam ;
        while(true){
            System.out.println("Nhap hang xe");
            hang = in.nextLine() ;
            if(hang.matches(h_regex)){
                break ;
            }
            else{
                System.out.println("Khong duoc chua ky tu dac biet hoac dau cach");
                
            }
        }       
        while(true){
            System.out.println("Nhap nam sx");
            nam = in.nextLine()  ;
            if(nam.matches(n_regex)){
                break ;
            }
            else{
                System.out.println("Nhap lai!");
            }
        }
        System.out.println("Nhap gia");
        Double gia = Double.parseDouble(in.nextLine()) ; 
        System.out.println("Nhap mau");
        String mau = in.nextLine() ; 
        System.out.println("Nhap loai dong co");
        String engine = in.nextLine() ;
        System.out.println("Nhap so ghe ngoi");
        int seats = Integer.parseInt(in.nextLine()) ;
        Oto v = new Oto(hang, nam, gia, mau, engine, seats) ;
        v.setMa() ;
        list.add(v) ;
    }

    @Override
    public void NhapXeMay(Scanner in) {
        String h_regex = "^[a-zA-Z0-9]+$" ;
        String n_regex = "\\d{4}" ;
        String hang, nam ;
        while(true){
            System.out.println("Nhap hang xe");
            hang = in.nextLine() ;
            if(hang.matches(h_regex)){
                break ;
            }
            else{
                System.out.println("Khong duoc chua ky tu dac biet hoac dau cach");
                
            }
        }       
        while(true){
            System.out.println("Nhap nam sx");
            nam = in.nextLine()  ;
            if(nam.matches(n_regex)){
                break ;
            }
            else{
                System.out.println("Nhap lai!");
            }
        }
        System.out.println("Nhap gia");
        Double gia = Double.parseDouble(in.nextLine()) ; 
        System.out.println("Nhap mau");
        String mau = in.nextLine() ; 
        System.out.println("Nhap congsuat");
        String congsuat = in.nextLine() ;
        XeMay v = new XeMay(hang, nam, gia, mau, congsuat) ;
        v.setMa() ;
        list.add(v) ;
    }

    @Override
    public void NhapXeTai(Scanner in) {
                String h_regex = "^[a-zA-Z0-9]+$" ;
        String n_regex = "\\d{4}" ;
        String hang, nam ;
        while(true){
            System.out.println("Nhap hang xe");
            hang = in.nextLine() ;
            if(hang.matches(h_regex)){
                break ;
            }
            else{
                System.out.println("Khong duoc chua ky tu dac biet hoac dau cach");
                
            }
        }       
        while(true){
            System.out.println("Nhap nam sx");
            nam = in.nextLine()  ;
            if(nam.matches(n_regex)){
                break ;
            }
            else{
                System.out.println("Nhap lai!");
            }
        }
        System.out.println("Nhap gia");
        Double gia = Double.parseDouble(in.nextLine()) ; 
        System.out.println("Nhap mau");
        String mau = in.nextLine() ; 
        System.out.println("Nhap trong tai");
        String trongtai = in.nextLine() ;
        XeTai v = new XeTai(hang, nam, gia, mau, trongtai) ;
        v.setMa() ;
        list.add(v) ;
    }

    @Override
    public void In() {
        for(PTGT x : list){
            System.out.println(x);
        }
        System.out.println(list.size());
    }

    @Override
    public void TimTheoMa(String s) {
        for(PTGT x : list){
            if(x.getMa().contains(s)){
                System.out.println(x);
            }
        }
    }

    @Override
    public void timTheoGia(Scanner in) {
        System.out.println("Nhap 2 moc gia");
        Double from = Double.parseDouble(in.nextLine()) ;
        Double to = Double.parseDouble(in.nextLine()) ;
        for(PTGT x : list){
            if(x.getGia() >= from && x.getGia() <= to){
                System.out.println(x);
            }
        }
    }

    @Override
    public void sapXepTheoGia() {
        list.sort(new Comparator<PTGT>(){
            @Override
            public int compare(PTGT o1, PTGT o2) {
                return Double.compare(o1.getGia(), o2.getGia()) ;
            }
            
        });
    }

    @Override
    public void thongKe() {
        Map<String, Long> mp = list.stream().collect(Collectors.groupingBy(PTGT::getNam,Collectors.counting())) ;
        Iterator<String> it = mp.keySet().iterator() ; 
        while(it.hasNext()){
            String s = it.next() ;
            System.out.println(s + " " + mp.get(s));
        }
    }
}
