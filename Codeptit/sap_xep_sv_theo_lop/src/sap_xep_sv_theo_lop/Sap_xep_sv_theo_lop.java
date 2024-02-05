/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sap_xep_sv_theo_lop;

import java.util.* ; 

class Student{
    private String id, name, group, email ;

    public Student(String id, String name, String group, String email) {
        this.id = id;
        this.name = name;
        this.group = group;
        this.email = email;
    }

    public String getGroup() {
        return group;
    }

    public String getId() {
        return id;
    }

    
    @Override
    public String toString() {
        return id + " " + name + " " + group + " " + email;
    }
    
    
}

public class Sap_xep_sv_theo_lop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ; 
        List<Student> ls = new ArrayList<>() ; 
        int n = Integer.parseInt(scanner.nextLine()) ; 
        for(int i = 0 ; i < n ; i++){
            ls.add(new Student(scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine())) ;
        }
        ls.sort(new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getGroup().equalsIgnoreCase(o2.getGroup())){
                    return o1.getId().compareTo(o2.getId()) ;
                }
                return o1.getGroup().compareTo(o2.getGroup()) ;
            }
        });
        for(Student x : ls){
            System.out.println(x);
        }
    }
    
}

//4
//B16DCCN011
//Nguyen Trong Duc Anh
//D16CNPM1
//sv1@stu.ptit.edu.vn
//B15DCCN215
//To Ngoc Hieu
//D15CNPM3
//sv2@stu.ptit.edu.vn
//B15DCKT150
//Nguyen Ngoc Son
//D15CQKT02-B
//sv3@stu.ptit.edu.vn
//B15DCKT199
//Nguyen Trong Tung
//D15CQKT03-B
//sv4@stu.ptit.edu.vn