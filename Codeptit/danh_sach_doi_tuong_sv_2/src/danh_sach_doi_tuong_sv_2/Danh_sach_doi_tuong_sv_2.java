/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package danh_sach_doi_tuong_sv_2;
import java.io.*;
import java.util.*;

class Student{
    String id,name,group,b_day, GPA;
    static int id_n = 1;

    public Student() {
    }

    public Student( String name, String group, String b_day, double GPA) {
        this.id = "B20DCCN" + String.format("%03d", id_n++);
        this.name = fix(name) ;
        this.group = group;
        this.b_day = fixdob(b_day);
        this.GPA = String.format("%.2f", GPA);
    }

    private String fixdob(String s){
        
        String[] str = s.split("/");
        while(str[0].length() < 2) str[0] = '0' + str[0];
        while(str[1].length() < 2) str[1] = '0' + str[1];
        while(str[2].length() < 4) str[2] = '0' + str[2];
        
        return str[0]+'/'+str[1]+'/'+str[2];
    }
    
    private String fix(String s){
        
        String[] arr = s.toLowerCase().trim().split("\\s+") ;
        String res = "" ;
        for(String x : arr){
            res += x.substring(0,1).toUpperCase() + x.substring(1) + " "; 
        }
        return res.substring(0,res.length()-1);
        
    }
    public void print(){
        
        System.out.println(String.format("%s %s %s %s %s", id, name, group, b_day, GPA));
        
    }
    
    
}

public class Danh_sach_doi_tuong_sv_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.valueOf(scanner.nextLine());

        while(t-- != 0){

            new Student(scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),Double.parseDouble(scanner.nextLine())).print();

        }
    }
    
}


//1
//nGuyEn  vaN    biNH
//D20CQCN01-B
//2/12/2002
//3.1