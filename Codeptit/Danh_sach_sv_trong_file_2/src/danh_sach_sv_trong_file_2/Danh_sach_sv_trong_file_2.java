
package danh_sach_sv_trong_file_2;

import java.io.* ; 
import java.util.* ; 

class Student{
    private String id, name, group, date;
    private double GPA ;
    private static int ID_NUM = 1 ;

    public Student( String name, String group, String date, double GPA) {
        this.id = "B20DCCN" + String.format("%03d", ID_NUM++);
        this.name = name;
        this.group = group;
        this.date = date;
        if(this.date.charAt(2) != '/'){             
            this.date = "0" + this.date.substring(0, 1) + this.date.substring(1);
        }
        if(this.date.charAt(5) != '/'){
            this.date = this.date.substring(0,3) + "0" + this.date.substring(3) ;
        }
        this.GPA = GPA;
    }
    
    public void out(){
        System.out.print(id + " " + name + " " + group + " " + date + " " );
        System.out.printf("%.2f", GPA);
        System.out.println("");
    }
}
public class Danh_sach_sv_trong_file_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            File obj = new File("SV.in") ;
            Scanner scanner = new Scanner(obj) ;
            int student_n = Integer.parseInt(scanner.nextLine()) ;
            Student[] arr = new Student[student_n] ; 
            for(int i = 0 ; i < student_n ; i++){
                String name = scanner.nextLine() ; 
                String group = scanner.nextLine() ;
                String date = scanner.nextLine() ;
                double GPA = Double.parseDouble(scanner.nextLine()) ;
                arr[i] = new Student(name, group, date, GPA) ; 
            }
            for(Student x : arr){
                x.out();
            }
        }
        catch(FileNotFoundException e){
            
        }
    }
    
}
