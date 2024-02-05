/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bang_diem_tp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Student{
    private String id, name, group ; 
    private double s1, s2, s3 ; 

    public Student(String id, String name, String group, double s1, double s2, double s3) {
        this.id = id;
        this.name = name;
        this.group = group;
        this.s1 = s1 ;
        this.s2 = s2 ;
        this.s3 = s3 ;
    }

    public String getName() {
        return name;
    }

    
    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + group + " " + s1 + " " + s2 + " " + s3 ;
    }
}
public class Bang_diem_tp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        List<Student> ls = new ArrayList<>() ;
        int n = Integer.parseInt(scanner.nextLine()) ;
        for(int i = 0 ; i < n ; i++){
            ls.add(new Student(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), Double.parseDouble(scanner.nextLine()), Double.parseDouble(scanner.nextLine()), Double.parseDouble(scanner.nextLine()))) ;
        }
        ls.sort(new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName()) ;
            }
        });
        for(int i = 1; i <= n ; i++){
            System.out.println(i + " " + ls.get(i - 1));
        }
    }
    
}

//3
//B20DCCN999
//Nguyen Van An
//D20CQCN04-B
//10.0
//9.0
//8.0
//B20DCAT001
//Le Van Nam
//D20CQAT02-B
//6.0
//6.0
//4.0
//B20DCCN111
//Tran Hoa Binh
//D20CQCN04-B
//9.0
//5.0
//6.0

//3
//B20DCCN999
//Nguyen Van Nam
//D20CQCN04-B
//10.0
//9.0
//8.0
//B20DCAT001
//Le Van An
//D20CQAT02-B
//6.0
//6.0
//4.0
//B20DCCN111
//Nguyen Van Binh
//D20CQCN01-B
//9.0
//5.0
//6.0