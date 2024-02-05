/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package run;

import controller.NganHang;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Cau43 {
    public static void main(String[] args) {
        NganHang n=new NganHang();
        System.out.println("ban dau");
        n.out();
        n.sapxepTheoMa();
        System.out.println("sap xep giam dan theo ma");
        n.out();
        n.sapxepTheoGiaTang();
        System.out.println("sap xep tang dan theo gia");
        n.out();
        n.sapxepTheoSoLuongGiam();
        System.out.println("sap xep giam dan theo so luong");
        n.out();
    }
}
