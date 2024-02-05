package danh_sach_thuc_tap_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.* ; 

class Student{
    private String id, name, group, email ; 

    public Student(String id, String name, String group, String email) {
        this.id = id;
        String[] arr = name.toLowerCase().strip().split("\\s+") ; 
        String s = "" ;
        for(String x : arr){
            s += x.substring(0, 1).toUpperCase() + x.substring(1) + " " ; 
        }
        this.name = s.strip();
        this.group = group;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", group=" + group + ", email=" + email + '}';
    }
    
    
}

class Enterprise{
    private String id, name;
    private int nums ; 

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getNums() {
        return nums;
    }

    
    public Enterprise(String id, String name, int nums) {
        this.id = id;
        this.name = name;
        this.nums = nums;
    }

    @Override
    public String toString() {
        return "Enterprise{" + "id=" + id + ", name=" + name + ", nums=" + nums + '}';
    }
    
}

class Intern{
    private String id_ent ; 
    private static List<Student> l_stu ; 
    private static List<Enterprise> l_ent ; 
    private Student s ; 
    private Enterprise e ; 

    public Intern(String id_stu, String id_ent) {
        this.id_ent = id_ent; 
        for(Student x : l_stu){
            if(x.getId().equals(id_stu)){
                this.s = x ; 
            }
        }
        for(Enterprise x : l_ent){
            if(x.getId().equals(id_ent)){
                this.e = x ; 
            }
        }
    }

    public String getId_ent() {
        return id_ent;
    }

    public static void setL_stu(List<Student> l_stu) {
        Intern.l_stu = l_stu;
    }

    public static void setL_ent(List<Enterprise> l_ent) {
        Intern.l_ent = l_ent;
    }

    public static String ent_name(String id){
        for(Enterprise x : l_ent){
            if(x.getId().equals(id)){
                return x.getName() ;
            }
        }
        return "" ;
    }
    @Override
    public String toString() {
        return s.getId() + " " + s.getName() + " " + s.getGroup() ;
    }

    
}
public class Danh_sach_thuc_tap_3 {

    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("SINHVIEN.in") ; 
        Scanner scanner = new Scanner(f) ; 
        int n = Integer.parseInt(scanner.nextLine()) ;
        List<Student> l_stu = new ArrayList<>() ;
        for(int i = 0 ; i < n ; i++){
            l_stu.add(new Student(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine())) ;
        }
        Intern.setL_stu(l_stu); 
        f = new File("DN.in") ; 
        scanner = new Scanner(f) ;
        int m = Integer.parseInt(scanner.nextLine()) ;
        System.out.println(m);
        List<Enterprise> l_en = new ArrayList<>() ; 
        for(int i = 0 ; i < m ; i++){
            l_en.add(new Enterprise(scanner.nextLine(), scanner.nextLine(), Integer.parseInt(scanner.nextLine()))) ;
        }
        Intern.setL_ent(l_en);
        f = new File("THUCTAP.in") ;
        scanner = new Scanner(f) ;
        List<Intern> l_in = new ArrayList<>() ; 
        int k = Integer.parseInt(scanner.nextLine()) ; 
        for(int i = 0 ; i < k ; i++){
            l_in.add(new Intern(scanner.next(), scanner.next())) ;
        }
        scanner.nextLine() ;
        int q = Integer.parseInt(scanner.nextLine()) ; 
        while(q-- > 0){
            String s = scanner.nextLine() ; 
            System.out.println("DANH SACH THUC TAP TAI " + Intern.ent_name(s));
            for(Intern x : l_in){
                if(x.getId_ent().equals(s)){
                    System.out.println(x);
                }
            }
        }
    }
    
}
