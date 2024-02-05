/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package run;

import java.util.ArrayList;
import java.util.List;
import model.GDTienTe;
import model.GDVang;
import model.GiaoDich;

/**
 *
 * @author ADMIN
 */
public class Data {
    public List<GiaoDich> getData(){
        List<GiaoDich> list=new ArrayList<>();
        GDVang v = new GDVang("12/04/2022", 120, 3, "9999");
        v.setMa();
        list.add(v);
        v = new GDVang("1/09/2023", 100, 8, "24k");
        v.setMa();
        list.add(v);
        v = new GDVang("18/10/2023", 100, 4, "24k");
        v.setMa();
        list.add(v);
        v = new GDVang("16/05/2023", 180, 3, "9999");
        v.setMa();
        list.add(v);
        GDTienTe t = new GDTienTe("21/04/2022", 200, 10, 23, "USD");
        t.setMa();
        list.add(t);
        return list;
    }
}
