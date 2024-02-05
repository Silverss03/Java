/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ds_giang_vien_theo_bo_mon;


import java.util.* ; 

class Teacher{
    private String id, name, subject ; 
    private static int id_n = 1 ;

    public Teacher(String name, String subject) {
        this.id = "GV" + String.format("%02d", id_n++) ;
        this.name = name;
        String[] arr = subject.split("\\s+") ;
        String s = "" ;
        for(String x : arr){
            s += x.toUpperCase().charAt(0) ;
        }
        this.subject = s;
    }

    public String getSubject() {
        return subject;
    }

    
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    
    @Override
    public String toString() {
        return id + " " + name + " " + subject ;
    }
    
    
}
public class Ds_giang_vien_theo_bo_mon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int n = Integer.parseInt(scanner.nextLine()) ;
        List<Teacher> ls = new ArrayList<>() ; 
        for(int i = 0 ; i < n ; i++){
            ls.add(new Teacher(scanner.nextLine(), scanner.nextLine())) ;
        }
        int q = Integer.parseInt(scanner.nextLine()) ;
        while(q-- > 0){
            String inp = scanner.nextLine() ;
            String s = "" ;
            String[] arr = inp.split("\\s+") ;
            for(String x : arr){
                s += x.toUpperCase().charAt(0) ;
            }
            System.out.println("DANH SACH GIANG VIEN BO MON " + s + ":");
            for(Teacher x : ls){
                if(x.getSubject().equalsIgnoreCase(s)){
                    System.out.println(x);
                }
            }
        }
    } 
}

//3
//Nguyen Manh Son
//Cong nghe phan mem
//Vu Hoai Nam
//Khoa hoc may tinh
//Dang Minh Tuan
//An toan thong tin
//1
//Cong nghe phan mem