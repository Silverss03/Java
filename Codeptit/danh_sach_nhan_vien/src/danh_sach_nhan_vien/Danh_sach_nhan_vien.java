package danh_sach_nhan_vien;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.* ; 

class Employee implements Comparable<Employee>{
    String id,  name, f_name ;
    Boolean gender ;
    Double salary ;

    public Employee(String id, String name, Boolean gender, Double salary) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
        String[] arr = this.name.split("\\s+") ;
        this.f_name = arr[arr.length - 1] ;
    }
    
    @Override
   public String toString(){
       String g = "" ;
       if(gender){
           g = "nam" ; 
       }
       else{
           g = "nu" ;
       }
       return id + " " + name + " " + g + " " + new DecimalFormat("#.#").format(salary) ;
   } 

    public String getF_name() {
        return f_name;
    }

    public String getName() {
        return name;
    }

    
    @Override
    public int compareTo(Employee o) {
        if(!f_name.equalsIgnoreCase(o.getF_name()))
            return f_name.compareToIgnoreCase(o.getF_name()) ;
        return name.compareToIgnoreCase(o.getName()) ;
    }
}
public class Danh_sach_nhan_vien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File f = new File("nhanvien.dat") ;
        List<Employee> ls = new ArrayList<>() ;
        try{
            Scanner scanner = new Scanner(f) ;
            while(scanner.hasNextLine()){
                String[] arr = scanner.nextLine().split("/") ;
                ls.add(new Employee(arr[0], arr[1], Boolean.parseBoolean(arr[2]), Double.parseDouble(arr[3]))) ;
            }
            Collections.sort(ls);
            for(Employee x : ls){
                System.out.println(x);
            }
            
        }
        catch(FileNotFoundException e){
            
        }
    }
    
}
