package run;

import model.GiaoDichTT;
import model.GiaoDichVang;

public class Cau1 {
    public static void main(String[] args) {
        GiaoDichVang g=new GiaoDichVang("2/3/2023", 100, 10,"9999");
        g.setMa();
        System.out.println(g);
        GiaoDichTT t=new GiaoDichTT("2/3/2023", 100, 10,23,"USD");
        t.setMa();
        System.out.println(t);
        t=new GiaoDichTT("2/3/2023", 100, 10,1,"vnd");
        t.setMa();
        System.out.println(t);
        
    }
}
