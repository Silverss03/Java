package sap_xep_danh_sach_sinh_vien;

/**
 *
 * @author Admin
 */

import java.io.* ;
import java.util.* ;

class Student{
    private String id, name, phone, email ; 

    public Student(String id, String name, String phone, String email) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
    
    
    @Override
    public String toString(){
        return id + " " + name + " " + phone + " " + email ;
    }
}
public class Sap_xep_danh_sach_sinh_vien {

    public static void main(String[] args) {
        try{
            File obj = new File("SINHVIEN.in") ;
            Scanner scanner = new Scanner(obj) ;
            int n = Integer.parseInt(scanner.nextLine()) ;
            List<Student> ls = new ArrayList<>() ; 
            for(int i = 0 ; i < n ; i++){
                String id = scanner.nextLine() ; 
                String name = scanner.nextLine() ;
                String phone = scanner.nextLine() ;
                String email = scanner.nextLine() ; 
                ls.add(new Student(id, name, phone, email)) ; 
            }
            ls.sort(new Comparator<Student>(){
                @Override
                public int compare(Student o1, Student o2) {
                    String l_name1 = o1.getName().substring(o1.getName().lastIndexOf(" ")) ;
                    String l_name2 = o2.getName().substring(o2.getName().lastIndexOf(" ")) ;
                    String f_name1 = o1.getName().substring(0, o1.getName().lastIndexOf(" ")) ;
                    String f_name2 = o2.getName().substring(0, o2.getName().lastIndexOf(" ")) ;
                    if(l_name1.equalsIgnoreCase(l_name2)){
                        if(f_name1.equalsIgnoreCase(f_name2)){
                            return o1.getId().compareTo(o2.getId()) ;
                        }
                        return f_name1.compareTo(f_name2) ;
                    }
                    return l_name1.compareTo(l_name2) ;
                }
            });
            for(Student x : ls){
                System.out.println(x);
            }
        }
        catch(Exception e){
            
        }
    }
    
}
