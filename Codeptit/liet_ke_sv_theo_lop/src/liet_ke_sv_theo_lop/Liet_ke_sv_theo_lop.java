/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package liet_ke_sv_theo_lop;

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

public class Liet_ke_sv_theo_lop {

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
        int q = Integer.parseInt(scanner.nextLine()) ;
        while(q-- > 0){
            String group = scanner.nextLine() ;
            String key = "" ; 
            String out = "*" ;
            if(group.equalsIgnoreCase("Ke toan")){
                key = "DCKT" ;
            }
            else if(group.equalsIgnoreCase("Cong nghe thong tin")){
                key = "DCCN" ;
                out = "E" ;
            }
            else if(group.equalsIgnoreCase("An toan thong tin")){
                key = "DCAT" ;
                out = "E" ;
            }
            else if(group.equalsIgnoreCase("Vien thong")){
                key = "DCVT" ;
            }
            else{
                key = "DCDT" ;
            }
            System.out.println("DANH SACH SINH VIEN NGANH " + group.toUpperCase() + ":");
            for(Student x : ls){
                if(x.getId().contains(key) && !x.getGroup().contains(out)){
                    System.out.println(x);
                }
            }
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
//D15CQKT02-B
//sv4@stu.ptit.edu.vn
//1
//D15CQKT02-B

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
//D15CQKT02-B
//sv4@stu.ptit.edu.vn
//1
//Ke toan