/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package danh_sach_doi_tuong_sv;

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
        this.name = name;
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

    @Override
    public String toString() {
        return  id + " " + name + " " + group + " " + b_day + " " + String.format("%.2f", GPA) ;
    }
    
    
}
    


public class Danh_sach_doi_tuong_sv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> ls = new ArrayList<>() ; 
        int n = Integer.parseInt(scanner.nextLine()) ;
        for(int i = 0 ; i < n ; i++){
            ls.add(new Student(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), Double.parseDouble(scanner.nextLine()))) ;
        }
        for(Student x : ls){
            System.out.println(x);
        }
    }
    
}

//1
//Nguyen Van An
//D20CQCN01-B
//2/12/2002
//3.19