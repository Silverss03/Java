/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package run;

import model.GDTienTe;
import model.GDVang;


public class Cau1 {
    public static void main(String[] args) {
        GDVang g=new GDVang("2/3/2023", 100, 10,"9999");
        g.setMa();
        System.out.println(g);
        GDTienTe t=new GDTienTe("2/3/2023", 100, 10,23,"USD");
        t.setMa();
        System.out.println(t);
        t=new GDTienTe("2/3/2023", 100, 10,1,"vnd");
        t.setMa();
        System.out.println(t);
    }
}
