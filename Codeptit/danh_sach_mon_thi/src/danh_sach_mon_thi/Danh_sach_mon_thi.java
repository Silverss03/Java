package danh_sach_mon_thi;

import java.io.* ; 
import java.util.* ;

public class Danh_sach_mon_thi {

    public static void main(String[] args) {
        File obj = new File("MONHOC.in") ;
        try{
            Scanner scanner = new Scanner(obj) ; 
            int n = Integer.parseInt(scanner.nextLine()) ; 
            List<Subject> ls = new ArrayList<>() ; 
            for(int i = 0 ; i < n ; i++){
                String id = scanner.nextLine() ; 
                String name = scanner.nextLine() ;
                String type = scanner.nextLine() ; 
                ls.add(new Subject(id, name, type)) ;
            }
            Collections.sort(ls);
            for(Subject x : ls){
                System.out.println(x);
            }
        }
        
        catch(FileNotFoundException e){
            
        }       
    }
    
}
