/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Comparator;

/**
 *
 * @author ADMIN
 */
public class ImplComparator implements Comparator<GDVang>{

    @Override
    public int compare(GDVang t1, GDVang t2) {
        return Double.compare(t1.getThanhTien(), t2.getThanhTien());
    }
    
}
