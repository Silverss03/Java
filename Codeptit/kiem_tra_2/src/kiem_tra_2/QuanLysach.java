/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiem_tra_2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class QuanLysach {
    List<SachHoc> list = new ArrayList<>() ; 

    public QuanLysach() {
    }

    public List<SachHoc> getList() {
        return list;
    }

    public void setList(List<SachHoc> list) {
        this.list = list;
    }
    
    public void nhapSachThamKhao(Scanner in){
        String ten = in.nextLine() ;
        String nxb = in.nextLine() ;
        Boolean loai = Boolean.parseBoolean(in.nextLine()) ; 
        Double gia = Double.parseDouble(in.nextLine()) ;
        SachThamKhao tmp = new SachThamKhao(ten, nxb, loai, gia) ;
        tmp.setMa();
        list.add(tmp) ;
    }
    
    public void nhapSachGiaoKhoa(Scanner in){
        String ten = in.nextLine() ;
        String nxb = in.nextLine() ;
        int lop = Integer.parseInt(in.nextLine()) ;
        int tap = Integer.parseInt(in.nextLine()) ;
        Boolean baitap = Boolean.parseBoolean(in.nextLine()) ;
        Double gia = Double.parseDouble(in.nextLine()) ;
        SachGiaoKhoa tmp = new SachGiaoKhoa(ten, nxb, lop, tap, baitap, gia) ;
        tmp.setMa() ;
        list.add(tmp) ;
    }
    
    public void out(){
        for(SachHoc x : list){
            System.out.println(x);
        }
    }
    
    public void sapXepSachGiaoKhoa(){
        List<SachGiaoKhoa> lsgk = new ArrayList<>() ;
        for(SachHoc x : list){
            if(x instanceof SachGiaoKhoa){
                lsgk.add((SachGiaoKhoa)x);
            } 
        }
        lsgk.sort(new Comparator<SachGiaoKhoa>(){
            @Override
            public int compare(SachGiaoKhoa o1, SachGiaoKhoa o2) {
                if(o1.getNhaXB().equalsIgnoreCase(o2.getNhaXB())){
                    return Double.compare(o1.getGia(), o2.getGia()) ;
                }
                return o1.getNhaXB().compareTo(o2.getNhaXB()) ;
            }
            
        });
        for(SachGiaoKhoa x : lsgk){
            System.out.println(x);
        }
    }
}

