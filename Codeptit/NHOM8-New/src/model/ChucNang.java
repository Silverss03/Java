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
    public void nhapGDVang(Scanner in);
    public void NhapGDTT(Scanner in);
    public void out();
    public void xoa(String ma);
    public void sua(String ma,Scanner in);
    public void timTheoLoaiVang(String loai);
    public void timGDVangTuGiaDenGia(double tu,double den);
    public void timTuDenSoLuong();
    public void sapXepTheoMa();
    public void sapXepTheoNgay();
    public void sapXepTheoThanhTien();
    public void thongKe();//max,min,sum,count,average
}
