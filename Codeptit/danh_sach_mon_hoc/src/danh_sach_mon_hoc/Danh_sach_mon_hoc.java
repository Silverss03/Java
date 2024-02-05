
package danh_sach_mon_hoc;

import java.io.* ; 
import java.util.* ;

class Subject implements Comparable<Subject>{
    private String id, name ; 
    private int credit_num ; 

    public Subject(String id, String name, int credit_num) {
        this.id = id;
        this.name = name;
        this.credit_num = credit_num;
    }

    public String getName() {
        return name;
    }
    
    
    @Override
    public String toString(){
        return id + " " + name + " " + credit_num ;
    }

    @Override
    public int compareTo(Subject o) {
        return name.compareTo(o.getName()) ; 
    }
    
    
}
public class Danh_sach_mon_hoc {

    public static void main(String[] args) throws FileNotFoundException{
        File obj = new File("MONHOC.in") ;
        Scanner scanner = new Scanner(obj) ; 
        int subject_n = Integer.parseInt(scanner.nextLine()) ;
        Subject[] sub = new Subject[subject_n] ;
        for(int i = 0 ; i < subject_n ; i++){
            String id = scanner.nextLine() ;
            String name = scanner.nextLine() ; 
            int num = Integer.parseInt(scanner.nextLine()) ;
            sub[i] = new Subject(id, name, num) ;
        }
        Arrays.sort(sub) ;
        for(Subject x : sub){
            System.out.println(x);
        }
     }
    
}
