/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package khai_bao_lop_sv;

import java.util.* ; 
public class SinhVien {
    private String id, name, group, b_day ;
    private float GPA ; 

    public SinhVien() {
        id = "B20DCCN001" ; 
        name = group = b_day = "" ; 
        GPA = 0 ;
    }
    
    public void inp(){
        Scanner scanner = new Scanner(System.in) ;
        name = scanner.nextLine() ;
        group = scanner.nextLine() ; 
        b_day = scanner.nextLine() ; 
        GPA = scanner.nextFloat() ; 
    }
    
    public void out(){
        System.out.print(id + " " + name + " " + group + " " + b_day + " ");
        System.out.printf("%.2f", GPA);
    }
}
