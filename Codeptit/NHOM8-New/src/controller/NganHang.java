/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;
import model.ChucNang;
import model.GDTienTe;
import model.GDVang;
import model.GiaoDich;

public class NganHang implements ChucNang {

    List<GiaoDich> list;

    public NganHang() {
        list = new ArrayList<>();
        
    }

    public List<GiaoDich> getList() {
        return list;
    }

    public void setList(List<GiaoDich> list) {
        this.list = list;
    }

    private GiaoDich nhap(Scanner in) {
        //ngay,gia,soluong
        GiaoDich t = new GiaoDich(in.nextLine(), Double.parseDouble(in.nextLine()),
                Integer.parseInt(in.nextLine()));
        return t;
    }

    @Override
    public void nhapGDVang(Scanner in) {
        GiaoDich d = nhap(in);
        GDVang v = new GDVang(d.getNgayGD(), d.getGia(), d.getSoluong(),
                in.nextLine());
        v.setMa();
        list.add(v);
    }

    @Override
    public void NhapGDTT(Scanner in) {
        GiaoDich d = nhap(in);
        GDTienTe v = new GDTienTe();
        v.setMa();
        v.setNgayGD(d.getNgayGD());
        v.setSoluong(d.getSoluong());
        v.setGia(d.getGia());
        String loai = in.nextLine();
        v.setLoaiTien(loai);
        double tg = 1;
        if (loai.toUpperCase().equals("VND")) {
            tg = 1;
        } else {
            tg = Double.parseDouble(in.nextLine());
        }
        v.setTyGia(tg);
        list.add(v);
    }

    @Override
    public void out() {
        for (GiaoDich i : list) {
            System.out.println(i);
        }
    }

    @Override
    public void xoa(String ma) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMa().equalsIgnoreCase(ma)) {
                list.remove(i);
                System.out.println("xoa thanh cong!!!");
                return;
            }
        }
        System.out.println("thay dau ma xoa");
    }

    @Override
    public void sua(String ma, Scanner in) {
        List<GDVang> lVang = new ArrayList<>();
        //loc
        for (GiaoDich i : list) {
            if (i instanceof GDVang) {
                lVang.add((GDVang) i);
            }
        }
//        System.out.println("ban dau");
//        for (GDVang k : lVang) {
//            System.out.println(k);
//        }
        for (int i = 0; i < lVang.size(); i++) {
            if (lVang.get(i).getMa().equalsIgnoreCase(ma)) {
                GDVang p = lVang.get(i);
                //nhap moi
                System.out.println(p);
                p.setNgayGD(in.nextLine());
                p.setGia(Double.parseDouble(in.nextLine()));
                p.setSoluong(Integer.parseInt(in.nextLine()));
                p.setLoaiVang(in.nextLine());
                System.out.println(p);
//                System.out.println("sau khu sua");
//                for (GDVang k : lVang) {
//                    System.out.println(k);
//                }
                return;
            }
        }
        System.out.println("khong tim thay");
    }

    

    @Override
    public void timTuDenSoLuong() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void sapXepTheoMa() {
        Collections.sort(list, new Comparator<GiaoDich>(){
            @Override
            public int compare(GiaoDich t, GiaoDich t1) {
                //tang dan
                //return t.getMa().compareToIgnoreCase(t1.getMa());
                //giam dan
                return t1.getMa().compareToIgnoreCase(t.getMa());
            }
        
        });
    }

    @Override
    public void sapXepTheoNgay() {
        list.sort(new Comparator<GiaoDich>(){
            @Override
            public int compare(GiaoDich t, GiaoDich t1) {
                String[] c1=t.getNgayGD().split("\\/");
                String[] c2=t1.getNgayGD().split("\\/");
                String b1=c1[2]+c1[1]+c1[0];
                String b2=c2[2]+c2[1]+c2[0];
                return b2.compareTo(b1);
            }
        
        });
    }

    @Override
    public void sapXepTheoThanhTien() {
        List<GDVang> lVang=new ArrayList<>();
        for(GiaoDich k:list){
            if(k instanceof GDVang){
                lVang.add((GDVang)k);
            }
        }
        lVang.sort(new Comparator<GDVang>(){
            @Override
            public int compare(GDVang t, GDVang t1) {
                //tang dan
                return Double.compare(t.getThanhTien(), t1.getThanhTien());
            }
        
        });
        for(GDVang i:lVang){
            System.out.println(i);
        }
    }
    public void xoaVang(String loai){
        List<GDVang> lVang=new ArrayList<>();
        for(GiaoDich k:list){
            if(k instanceof GDVang){
                lVang.add((GDVang)k);
            }
        }
        Iterator i=lVang.iterator();
        while(i.hasNext()){
            GDVang g=(GDVang)i.next();
            if(g.getLoaiVang().equalsIgnoreCase(loai)){
                i.remove();
            }
        }
        for(GDVang k:lVang){
            System.out.println(k);
        }
    }
    //moi nam co bao nhieu giao dich
    @Override
    public void thongKe() {
        Map<Integer,Long> c=list.stream().collect(
           Collectors.groupingBy(GiaoDich::getNam,Collectors.counting()));
        System.out.println(c);
        Iterator<Integer> i=c.keySet().iterator();
        while(i.hasNext()){
            Integer k=i.next();
            System.out.println(k+":"+c.get(k));
        }
    }
    //tinh tong so luong theo tung loai vang
    public void sumVangTheoLoai(){
        List<GDVang> lVang=new ArrayList<>();
        for(GiaoDich k:list){
            if(k instanceof GDVang){
                lVang.add((GDVang)k);
            }
        }
        Map<String,Integer> s=lVang.stream().collect(Collectors.
                groupingBy(GDVang::getLoaiVang,
                        Collectors.summingInt(GDVang::getSoluong)));
        System.out.println(s);
    }
    //dua ra vang co thanh tien cao nhat
    public void maxVang(){
        List<GDVang> lVang=new ArrayList<>();
        for(GiaoDich k:list){
            if(k instanceof GDVang){
                lVang.add((GDVang)k);
            }
        }
        Optional<GDVang> m=lVang.stream().collect(Collectors.maxBy(
            Comparator.comparing(GDVang::getThanhTien)));
        System.out.println(m.get());
    }
    //dua ra tien cao nhat theo tung loai vang
    public void maxVangTheoLoai(){
        List<GDVang> lVang=new ArrayList<>();
        for(GiaoDich k:list){
            if(k instanceof GDVang){
                lVang.add((GDVang)k);
            }
        }
        Map<String,GDVang> m=lVang.stream().collect(Collectors.
                groupingBy(GDVang::getLoaiVang,Collectors.
                        collectingAndThen(Collectors.
                                reducing((GDVang v1,GDVang v2)->
                                        v1.getThanhTien()>v2.getThanhTien()?v1:v2),
                                Optional::get)));
        Iterator<String> i=m.keySet().iterator();
        while(i.hasNext()){
            String k=i.next();
            System.out.println(k);
            System.out.println(m.get(k));
        }
    }
    
    @Override
    public void timTheoLoaiVang(String loai) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void timGDVangTuGiaDenGia(double tu, double den) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    //sap xep
    //con lai
}
