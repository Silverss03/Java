/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiem_tra_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
public static void main(String[] args) {
        QuanLysach q=new QuanLysach();
        List<SachHoc> list=new ArrayList<>();
        SachThamKhao k=new SachThamKhao("toan lop 6","giao duc", false, 45);
        k.setMa();
        list.add(k);
        k=new SachThamKhao("ly lop 11","dong nai", true, 90);
        k.setMa();
        list.add(k);
        SachGiaoKhoa g=new SachGiaoKhoa("toan", "dong nai", 5, 1, true, 50);
        g.setMa();
        list.add(g);
        g=new SachGiaoKhoa("tieng viet", "giao duc", 5, 2, false, 60);
        g.setMa();
        list.add(g);
        g=new SachGiaoKhoa("giao duc CD", "giao duc", 6, 1, false, 30);
        g.setMa();
        list.add(g);
        g=new SachGiaoKhoa("dia ly", "giao duc", 6, 1, false, 70);
        g.setMa();
        list.add(g);
        g=new SachGiaoKhoa("vat ly", "minh Chau", 9, 1, true, 90);
        g.setMa();
        list.add(g);
        q.setList(list);
        q.sapXepSachGiaoKhoa();
    }
    
}
//toan lop 4
//su pham
//true
//70
//toan
//giao duc
//8
//2
//true
//48

