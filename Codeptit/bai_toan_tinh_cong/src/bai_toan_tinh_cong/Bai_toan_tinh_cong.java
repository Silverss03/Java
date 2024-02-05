/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai_toan_tinh_cong;

import java.text.DecimalFormat;
import java.util.* ; 

class Employee{
    private String id, name, pos ;
    private int bas_sal, bonus, pos_m , total ;

    public Employee(String name, int bas_sal, int days, String pos) {
        id = "NV01" ;
        this.name = name;
        this.pos = pos;
        this.bas_sal = bas_sal * days;
        if(days >= 25){
            bonus = (this.bas_sal * 20)/100 ; 
        }
        else if(days >= 22){
            bonus = (this.bas_sal * 10)/100 ;
        }
        else{
            bonus = 0 ;
        }
        if(pos.equalsIgnoreCase("GD")){
            pos_m = 250000 ;
        }
        else if(pos.equalsIgnoreCase("PGD")){
            pos_m = 200000 ;
        }
        else if(pos.equalsIgnoreCase("TP")){
            pos_m = 180000 ;
        }
        else{
            pos_m = 150000 ;
        }
        total = this.bas_sal + bonus + pos_m ;  
    }
    
    @Override
    public String toString(){
        return id + " " + name + " " + pos + " " + bas_sal + " " +bonus + " " + pos_m + " " + total ; 
    }
    
}
public class Bai_toan_tinh_cong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(new Employee(scanner.nextLine(), Integer.parseInt(scanner.nextLine()), Integer.parseInt(scanner.nextLine()), scanner.nextLine()));
        scanner.close();
    }
    
}

//Bui Thi Trang
//45000
//23
//PGD