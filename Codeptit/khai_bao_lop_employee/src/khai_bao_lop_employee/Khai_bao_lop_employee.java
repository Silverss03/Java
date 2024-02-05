package khai_bao_lop_employee;

import java.util.Scanner ; 

class Employee{
    private String id, gender, name, b_day, address, tax_num, contract_date ;

    public Employee() {
        id = "00001" ;
    }
    
    private String fix(String a){
        if(a.charAt(2) != '/'){
            a = "0".concat(a) ;
        }
        if(a.charAt(5) != '/'){
            a = a.substring(0, 3) + "0" + a.substring(3) ;
        }
        return a ;
    }
    public void inp(){
        Scanner scanner = new Scanner(System.in) ; 
        name = scanner.nextLine() ; 
        gender = scanner.nextLine() ; 
        b_day = scanner.nextLine() ; 
        b_day = fix(b_day) ; 
        address = scanner.nextLine() ; 
        tax_num = scanner.nextLine() ;
        contract_date = scanner.nextLine() ;
        contract_date = fix(contract_date) ;
    }
    
    public void out(){
        System.out.println(id + " " + name + " " +gender +  " " + b_day + " " + address + " " + tax_num + " " + contract_date);
    }
}
public class Khai_bao_lop_employee {

    public static Scanner scanner = new Scanner(System.in) ; 
    public static void main(String[] args) {
        Employee a = new Employee() ;
        a.inp() ;
        a.out() ;
    } 
    
}
