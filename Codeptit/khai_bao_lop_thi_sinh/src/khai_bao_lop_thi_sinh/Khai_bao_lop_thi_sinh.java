package khai_bao_lop_thi_sinh;

import java.util.* ;
class Student{
    private String name, b_day ;
    private double p1, p2, p3, p_total ;

    public Student() {
    }

    public Student(String name, String b_day, double p1, double p2, double p3) {
        this.name = name;
        this.b_day = b_day;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p_total = p1 + p2 + p3 ;
    }
    
    public void out(){
        System.out.print(name + " " + b_day + " " );
        System.out.printf( "%.1f", p_total);
    }
    
}
public class Khai_bao_lop_thi_sinh {

    public static Scanner scanner = new Scanner(System.in) ;
    public static void main(String[] args) {
        String name = scanner.nextLine() ; 
        String b_day = scanner.nextLine() ; 
        double p1 = Double.parseDouble(scanner.nextLine()) ; 
        double p2 = Double.parseDouble(scanner.nextLine()) ; 
        double p3 = Double.parseDouble(scanner.nextLine()) ;
        Student s = new Student(name, b_day, p1, p2, p3) ;
        s.out();
    }
    
}
