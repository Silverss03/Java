/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import controller.TrongException;
import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class NganHang implements Serializable{
    private String name ;
    private int id, amount ; 
    private static int id_n = 100 ; 

    public NganHang() {
    }

    public NganHang(String name, int amount) throws TrongException {
        if(name.isEmpty()) throw new TrongException() ;     
        this.id = id_n++ ; 
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public static int getId_n() {
        return id_n;
    }

    public static void setId_n(int id_n) {
        NganHang.id_n = id_n;
    }
    
    public Object[] toObject(){
        return new Object[]{
            id, name,amount
        } ;
    }
    
}
