/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package run;

import controller.NganHang;

/**
 *
 * @author ADMIN
 */
public class Cau5_1 {
    public static void main(String[] args) {
        NganHang n=new NganHang();
        Data d=new Data();
        n.setList(d.getData());
        //n.thongKe();
        n.out();
        System.out.println("-----------------");
        //n.sumVangTheoLoai();
        n.maxVangTheoLoai();
    }
}
