/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package run;

import kt2q6.GDVang;
import kt2q6.GDTT ;

public class Cau1 {
    public static void main(String[] args) {
        GDVang g=new GDVang("2/3/2023", 100, 10,"9999");
        g.setId();
        System.out.println(g);
        GDTT t = new GDTT("2/3/2023", 100, 10,23,"USD") ;
        t.setId();
        System.out.println(t);
        t=new GDTT("2/3/2023", 100, 10,1,"vnd");
        t.setId();
        System.out.println(t);
        
    }

}
