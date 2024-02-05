/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import controller.SoDTException;
import controller.TrongException;
import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class KhachHang implements Serializable{
    private String name, address, type ; 
    private int id ; 
    private static int id_n = 10000 ; 

    public KhachHang() {
    }

    
    public KhachHang(String name, String address,String type) throws TrongException {
        if(name.isEmpty() || address.isEmpty() || type.isEmpty()) throw new TrongException() ;
        this.id = id_n++ ; 
        this.name = name;
        this.address = address;
        this.type = type ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getId_n() {
        return id_n;
    }

    public static void setId_n(int id_n) {
        KhachHang.id_n = id_n;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public Object[] toObject(){
        return new Object[]{
          id, name, address, type 
        };
    }
}
