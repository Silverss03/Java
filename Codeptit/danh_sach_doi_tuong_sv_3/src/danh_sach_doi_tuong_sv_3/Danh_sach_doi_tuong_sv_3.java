/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package danh_sach_doi_tuong_sv_3;

import java.io.*;
import java.util.*;

class Student{
    private String id, name, b_day, group ;
    private double GPA ; 
    private static int id_n = 1 ;

    public Student() {
    }

    public Student( String name, String group, String b_day, double GPA) {
        this.id = "B20DCCN" + String.format("%03d", id_n++);
        String[] arr = name.toLowerCase().trim().split("\\s+") ;
        String res = "" ;
        for(String x : arr){
            res += x.substring(0,1).toUpperCase() + x.substring(1).toLowerCase() + " "; 
        }
        this.name = res ;
        if(b_day.charAt(2) != '/'){
            b_day = '0' + b_day ;
        }
        if(b_day.charAt(5) != '/'){
            b_day = b_day.substring(0,3) + '0' + b_day.substring(3) ;
        }
        this.b_day = b_day;
        this.group = group;
        this.GPA = GPA;
    }

    public double getGPA() {
        return GPA;
    }

    
    @Override
    public String toString() {
        return  id + " " + name + " " + group + " " + b_day + " " + String.format("%.2f", GPA) ;
    }
    
    
}

public class Danh_sach_doi_tuong_sv_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.valueOf(scanner.nextLine());
        List<Student> ls = new ArrayList<>() ; 
        for(int i = 0 ; i < n ; i++){
            ls.add(new Student(scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),Double.parseDouble(scanner.nextLine()))) ;
        }
        ls.sort(new  Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o2.getGPA(), o1.getGPA());
             }
        });
        for(Student x : ls){
            System.out.println(x);
        }
    }
    
}


