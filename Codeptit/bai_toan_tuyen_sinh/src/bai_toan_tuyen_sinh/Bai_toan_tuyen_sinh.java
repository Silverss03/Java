/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai_toan_tuyen_sinh;

import java.text.DecimalFormat;
import java.util.*;

class Student{
    private double math, physic, chemist, bonus, point ;
    private String name, id, status ; 

    public Student(String id, String name, double math, double physic, double chemist) {
        this.id = id;
        this.math = math;
        this.physic = physic;
        this.chemist = chemist;
        this.name = name;
        if(id.substring(0, 3).equals("KV1")){
            bonus = 0.5 ;
        }
        else if(id.substring(0, 3).equals("KV2")){
            bonus = 1 ;
        }
        else{
            bonus = 2.5 ; 
        }
        this.point = math * 2 + physic + chemist + bonus; 
        if(this.point >= 24){
            this.status = "TRUNG TUYEN" ;
        }
        else{
            this.status = "TRUOT" ;
        }
    }

    public double getPoint() {
        return point;
    }

    
    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getPhysic() {
        return physic;
    }

    public void setPhysic(double physic) {
        this.physic = physic;
    }

    public double getChemist() {
        return chemist;
    }

    public void setChemist(double chemist) {
        this.chemist = chemist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return  id + " " + name + " " + new DecimalFormat("#.#").format(bonus) + " " + new DecimalFormat("#.#").format(this.point) + " " + status;
    }
    
    
}
public class Bai_toan_tuyen_sinh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine()) ;
        List<Student> ls = new ArrayList<>() ; 
        for(int i = 0 ; i < n ; i++){
            ls.add(new Student(scanner.nextLine(), scanner.nextLine(), Double.parseDouble(scanner.nextLine()), Double.parseDouble(scanner.nextLine()), Double.parseDouble(scanner.nextLine())));
        }
        ls.sort(new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2) {
                if(o2.getPoint() != o1.getPoint())
                    return Double.compare(o2.getPoint(), o1.getPoint()) ;
                else
                    return o1.getId().compareTo(o2.getId()) ;
            }
            
        });
        for(Student x : ls){
            System.out.println(x);
        }
    }
    
}
//2
//KV2A002
//Hoang Thanh Tuan
//5
//6
//5
//KV2B123
//Ly Thi Thu Ha
//8
//6.5
//7