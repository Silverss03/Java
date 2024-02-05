/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public interface ChucNang {
    //input GD vang, GD tt, out, delete/update/search sort don gian kong kenh
    //thong ke - map
    public void nhapGDVang(Scanner in);
    public void NhapGDTT(Scanner in);
    public void out();
    public void xoa(String ma);
    public void suaGDVang(String ma);
    public void timTheoLoaiVang(String key);
    public void timGDVangTuGiaDenGia(double tu,double den);
    public void sapxepTheoMa();//giam dan
    public void sapxepTheoGiaTang();//tang dan
    public void sapxepTheoSoLuongGiam();//giam dan
    public void sapxepTheoThanhTien() ;
    public void sapxepTheoNgay() ;
    public void thongKe() ;
    public void sumVangTheoLoai() ;
}
