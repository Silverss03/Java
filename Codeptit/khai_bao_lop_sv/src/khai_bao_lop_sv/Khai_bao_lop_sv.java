package khai_bao_lop_sv;

import java.util.Scanner ;
class SinhVien {
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
        if(b_day.charAt(2) != '/'){
            b_day = "0".concat(b_day) ;
        }
        if(b_day.charAt(5) != '/'){
            b_day = b_day.substring(0, 3) + "0" + b_day.substring(3) ;
        }
        GPA = scanner.nextFloat() ; 
    }
    
    public void out(){
        System.out.print(id + " " + name + " " + group + " " + b_day + " ");
        System.out.printf("%.2f", GPA);
    }
}
public class Khai_bao_lop_sv {

    public static Scanner scanner = new Scanner(System.in) ; 
    public static void main(String[] args) {
        SinhVien a = new SinhVien() ; 
        a.inp() ;
        a.out() ;
    }
    
}
