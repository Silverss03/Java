/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import ds_gd.ChucNang;
import ds_gd.GDTienTe;
import ds_gd.GDVang;
import ds_gd.GiaoDich;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Admin
 */
public class QLNGanHang implements ChucNang{
    List<GiaoDich> list ;

    public QLNGanHang() {
        list = new ArrayList<>() ; 
        
    }
    private GiaoDich nhap(Scanner in){
        GiaoDich tmp = new GiaoDich() ;
        tmp.setNgayGD(in.nextLine()) ;
        tmp.setSoluong(Integer.parseInt(in.nextLine())) ;
        tmp.setGia(Double.parseDouble(in.nextLine()));
        return tmp ; 
    }
    
    @Override
    public void nhapGDVang(Scanner in) {
        GiaoDich d = nhap(in) ;
        GDVang v = new GDVang() ;
        v.setMa(v.getMa()) ;
        v.setNgay(v.getNgay()) ;
        v.setSoLuong(v.getSoLuong()) ;
        v.setGia(v.getGia()) ;
        v.setLoaiVang(in.nextLine()) ;
        list.add(v) ;
    }

    @Override
    public void nhapGDTT(Scanner in) {
        GiaoDich d = nhap(in) ;
        GDTienTe v = new GDTienTe() ;
        v.setMa(v.getMa()) ;
        v.setNgayGD(v.getNgayGD()) ;
        v.setSoluong(v.getSoluong()) ;
        v.setGia(v.getGia()) ;
        String loai = in.nextLine() ;
        v.setLoaiTien(loai) ;
        double tg = 1 ;
        if(loai.equals("VND"))
            tg = 1;
        else{
            tg = Double.parseDouble(in.nextLine()) ;
        }
        v.setTyGia(tg) ;
        list.add(v) ;
    }

    @Override
    public void out() {
        for(GiaoDich i :list){
            System.out.println(i);
        }
    }

    @Override
    public void xoa() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void sua() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void timTheoMa() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void timTheoNgay() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void timTuDen() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void timTuDenSoLuong() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void sapXepTheoMa() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void sapXepTheoThanhTien() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void thongKe() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
