package danh_sach_trung_tuyen;

import java.io.* ;
import java.util.* ;
import java.text.DecimalFormat;
class Student implements Comparable<Student>{
    private String id, name ;
    private Double mark, add ;

    public Student(String id, String name, Double math, Double physic, Double chemistry) {
        this.id = id;
        String[] arr = name.trim().toLowerCase().split("\\s+") ;
        String s = "" ;
        for(String i : arr){
            s += i.substring(0,1).toUpperCase() + i.substring(1) + " " ;
        }
        this.name = s;
        this.mark = math*2 + physic + chemistry ;
        if(id.charAt(2) == '1'){
            this.add = 0.5 ;
        }
        else if(id.charAt(2) == '2'){
            this.add = 1D ;
        }
        else{
            this.add = 2.5 ;
        }
        this.mark += this.add ;
    }

    public Double getMark() {
        return mark;
    }

    public String getId() {
        return id;
    }

    
    public static String removeZero(double number) {
        DecimalFormat format = new DecimalFormat("#.#");
        return format.format(number);
    }
    @Override
    public String toString(){
        return id + " " + name  + removeZero(this.add) + " " + removeZero(this.mark) ;
    }
    @Override
    public int compareTo(Student o) {
        if(mark != o.getMark())return -mark.compareTo(o.getMark()) ;
        else return id.compareTo(o.getId()) ;
    }
}
public class Danh_sach_trung_tuyen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        File obj = new File("THISINH.in") ;
        Scanner scanner = new Scanner(obj) ;
        int n = Integer.parseInt(scanner.nextLine()) ;
        List<Student> ls = new ArrayList<>() ;
        for(int i = 0 ; i < n ; i++){
            String id = scanner.nextLine().trim() ; 
            String name = scanner.nextLine().trim() ;
            Double math = Double.parseDouble(scanner.nextLine()) ;
            Double physic = Double.parseDouble(scanner.nextLine()) ;
            Double chemis = Double.parseDouble(scanner.nextLine()) ;
            Student tmp = new Student(id, name, math, physic, chemis) ;
            ls.add(tmp) ;
        }
        Collections.sort(ls);
        n = Integer.parseInt(scanner.nextLine()) ;
        Double lim = ls.get(n - 1).getMark() ;
        System.out.println(String.format("%.1f",lim));
        for(Student x : ls){
            System.out.print(x);
            if(x.getMark() >= lim){
                System.out.println(" TRUNG TUYEN");
            }
            else{
                System.out.println(" TRUOT");
            }
        }
    }
    
}
