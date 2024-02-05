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
import model.GiaoDich;
import model.GiaoDichTT;
import model.GiaoDichVang;

/**
 *
 * @author ADMIN
 */
public class NganHang implements ChucNang {

    List<GiaoDich> list;

    public NganHang() {
        list = new ArrayList<>();
        GiaoDichVang v = new GiaoDichVang("01/01/2022", 100, 10, "24k");
        v.setMa();
        list.add(v);
        v = new GiaoDichVang("12/10/2023", 200, 20, "9999");
        v.setMa();
        list.add(v);
        GiaoDichTT t = new GiaoDichTT("13/09/2022", 100, 10, 1, "VND");
        t.setMa();
        list.add(t);
    }

    private GiaoDich nhap(Scanner in) {
        GiaoDich d = new GiaoDich(in.nextLine(),
                Double.parseDouble(in.nextLine()),
                Integer.parseInt(in.nextLine()));
        return d;
    }

    @Override
    public void nhapGDVang(Scanner in) {
        GiaoDich d = nhap(in);
        GiaoDichVang v = new GiaoDichVang(
                d.getNgay(),
                d.getGia(),
                d.getSoluong(),
                in.nextLine());
        v.setMa();
        list.add(v);
    }

    @Override
    public void NhapGDTT(Scanner in) {
        GiaoDich d = nhap(in);
        GiaoDichTT t = new GiaoDichTT();
        t.setMa();
        t.setNgay(d.getNgay());
        t.setGia(d.getGia());
        t.setSoluong(d.getSoluong());
        String loai = in.nextLine().toUpperCase();
        t.setLoaiTien(loai);
        double tg = 1;
        if (loai.equals("VND")) {
            tg = 1;
        } else {
            tg = Double.parseDouble(in.nextLine());
        }
        t.setTigia(tg);
        list.add(t);
    }

    @Override
    public void out() {
        for (GiaoDich i : list) {
            System.out.println(i);
        }
    }

    private int getGDByMa(String ma) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMa().equalsIgnoreCase(ma)) {
                return i;
            }
        }
        return -1;//khong tin thay
    }

    @Override
    public void xoa(String ma) {
        int pos = getGDByMa(ma);
        if (pos == -1) {
            System.out.println("thay dau ma xoa");
        } else {
            list.remove(pos);
            System.out.println("xoa thanh cong!!!");
        }
    }

    @Override
    public void suaGDVang(String ma) {
        List<GiaoDichVang> lvang = new ArrayList<>();
        for (GiaoDich i : list) {
                if (i instanceof GiaoDichVang) {
                    lvang.add((GiaoDichVang) i);
                }
            }
        Scanner in=new Scanner(System.in);
        for (int i = 0; i < lvang.size(); i++) {
            if(lvang.get(i).getMa().equalsIgnoreCase(ma)){
                //da tim thay
                GiaoDichVang p=lvang.get(i);
                //nhap moi
                p.setNgay(in.nextLine());
                p.setGia(Double.parseDouble(in.nextLine()));
                p.setSoluong(Integer.parseInt(in.nextLine()));
                p.setLoaiVang(in.nextLine());
                System.out.println("sua thanh cong");
//                for(GiaoDichVang k:lvang){
//                    System.out.println(k);
//                }
                return;
            }
        }
        System.out.println("Khong tim thay");
    }

    @Override
    public void timTheoLoaiVang(String key) {
        List<GiaoDichVang> lvang = new ArrayList<>();
        for (GiaoDich i : list) {
            if (i instanceof GiaoDichVang) {
                lvang.add((GiaoDichVang) i);
            }
        }
        int k=0;
        for (int i = 0; i < lvang.size(); i++) {
            if(lvang.get(i).getLoaiVang().equalsIgnoreCase(key.trim())){
                System.out.println(lvang.get(i));
                k++;
            }
        }
        if(k==0){
            System.out.println("khong tim thay");
        }
    }

    @Override
    public void timGDVangTuGiaDenGia(double tu, double den) {
        List<GiaoDichVang> lvang = new ArrayList<>();
        for (GiaoDich i : list) {
                if (i instanceof GiaoDichVang) {
                    lvang.add((GiaoDichVang) i);
                }
            }
        int k=0;
        for (int i = 0; i < lvang.size(); i++) {
            if(lvang.get(i).getGia()>=tu && lvang.get(i).getGia()<=den){
                System.out.println(lvang.get(i));
                k++;
            }
        }
        if(k==0){
            System.out.println("khong tim thay");
        }
    }

    @Override
    public void sapxepTheoMa() {
        Collections.sort(list, new Comparator<GiaoDich>(){
            @Override
            public int compare(GiaoDich t, GiaoDich t1) {
                return t1.getMa().compareTo(t.getMa());
            }
        
        });
    }

    @Override
    public void sapxepTheoGiaTang() {
        list.sort(new Comparator<GiaoDich>(){
            @Override
            public int compare(GiaoDich t, GiaoDich t1) {
                return Double.compare(t.getGia(), t1.getGia());
            }
        
        });
    }

    @Override
    public void sapxepTheoSoLuongGiam() {
        list.sort(new Comparator<GiaoDich>(){
            @Override
            public int compare(GiaoDich t, GiaoDich t1) {
                return t1.getSoluong()-t.getSoluong();
            }
        
        });
    }

    @Override
    public void sapxepTheoThanhTien() {
        List<GiaoDichVang> lVang = new ArrayList<>() ;
        for(GiaoDich k : list){
            if(k instanceof GiaoDichVang){
                lVang.add((GiaoDichVang)k) ;
            }
        }
        lVang.sort(new Comparator<GiaoDichVang>(){
            @Override
            public int compare(GiaoDichVang t, GiaoDichVang t1){
                return Double.compare(t.getThanhTien(), t1.getThanhTien()) ;
            }
        });
    }

    @Override
    public void sapxepTheoNgay() {
        list.sort(new Comparator<GiaoDich>(){
            @Override
            public int compare(GiaoDich t, GiaoDich t1){
                String[] c1 = t.getNgay().split("\\/") ;
                String[] c2 = t1.getNgay().split("\\/") ;
                String b1 = c1[2] + c1[1] + c1[0] ;
                String b2 = c2[2] + c2[1] + c1[0] ;
                return b1.compareTo(b2) ;
            }
        });
    }

    @Override
    public void thongKe() {
        Map<Integer, Long> c = list.stream().collect(Collectors.groupingBy(GiaoDich::getNam, Collectors.counting())) ;
        Iterator<Integer> i = c.keySet().iterator() ;
        while(i.hasNext()){
            Integer k = i.next() ;
            System.out.println(k + ":" + c.get(k));
        }
    }

    public List<GiaoDich> getList() {
        return list;
    }

    public void setList(List<GiaoDich> list) {
        this.list = list;
    }

    @Override
    public void sumVangTheoLoai() {        
        List<GiaoDichVang> lVang = new ArrayList<>() ;
        for(GiaoDich k : list){
            if(k instanceof GiaoDichVang){
                lVang.add((GiaoDichVang)k) ;
            }
        }
        Map<String, Integer> mp = lVang.stream().collect(Collectors.groupingBy(GiaoDichVang::getLoaiVang, Collectors.summingInt(GiaoDichVang::getSoluong))) ;
        System.out.println(mp);
    }
    public void maxVang(){
        List<GiaoDichVang> lVang = new ArrayList<>() ;
        for(GiaoDich k : list){
            if(k instanceof GiaoDichVang){
                lVang.add((GiaoDichVang)k) ;
            }
        }
        Optional<GiaoDichVang> m = lVang.stream().collect(Collectors.maxBy(Comparator.comparing(GiaoDichVang::getThanhTien))) ;
        System.out.println(m.get());
    }
    public void xoaVang(String type){
        for(int i = 0 ; i < list.size() ; i++){
            if(list.get(i) instanceof GiaoDichVang){
                GiaoDichVang tmp = (GiaoDichVang) list.get(i) ;
                if(tmp.getLoaiVang().equalsIgnoreCase(type)){
                    list.remove(i) ;
                }
            }
        }
        
    }
}
