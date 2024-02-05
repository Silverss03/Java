/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package kt2q6;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public interface ChucNang {
    public void NhapGDVang(Scanner in) ;
    public void NhapGDTT(Scanner in) ;
    public void out() ;
    public void xoa(String id) ;
    public void sua(String id) ;
    public void timTheoLoaiVang(String type) ;
    public void timGDVangTuGiaDenGia(double from, double to) ;
}
