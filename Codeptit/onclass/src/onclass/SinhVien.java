/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onclass;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
class SinhVien implements Serializable{
    private String id, name ; 
    public SinhVien(String id, String name){
        this.id = id ; 
        this.name = name ; 
    }
    public String toString(){
        return this.id + " " + this.name +"\n";
    }
}
