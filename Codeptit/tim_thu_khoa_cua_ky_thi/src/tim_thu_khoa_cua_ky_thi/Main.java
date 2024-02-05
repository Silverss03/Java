/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tim_thu_khoa_cua_ky_thi;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Student{
    private String name, b_day, id ; 
    private static int id_n = 1 ; 
    private static double max = -1 ;
    private double total ; 

    public Student(String name, String b_day, double s1, double s2, double s3) {
        this.id = Integer.toString(id_n++) ;
        this.name = name;
        this.b_day = b_day;
        this.total = s1 + s2 + s3;
        if(this.total > max){
            max = this.total ;
        }
    }

    public String getId() {
        return id;
    }
    
    public boolean isValid(){
        if(this.total == max){
            return true ;
        }
        return false; 
    }
    
    @Override
    public String toString(){
        return id + " " + name + " " + b_day + " " + new DecimalFormat("#.#").format(total) ;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ; 
        List<Student> ls = new ArrayList<>() ; 
        int n = Integer.parseInt(scanner.nextLine()) ;
        for(int i = 0 ; i < n ; i++){
            ls.add(new Student(scanner.nextLine(), scanner.nextLine(), Double.parseDouble(scanner.nextLine()), Double.parseDouble(scanner.nextLine()), Double.parseDouble(scanner.nextLine()))) ;
        }
        ls.sort(new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getId().compareTo(o2.getId()) ;
            }
            
        });
        for(Student x : ls){
            if(x.isValid()){
                System.out.println(x);
            }
        }
    }
}

//3
//Nguyen Van A
//12/12/1994
//3.5
//7.0
//5.5
//Nguyen Van B
//1/9/1994
//7.5
//9.5
//9.5
//Nguyen Van C
//6/7/1994
//8.5
//9.5
//8.5