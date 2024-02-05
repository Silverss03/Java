package diem_tuyen_sinh;

import java.io.* ;
import java.util.* ;

public class Diem_tuyen_sinh {

    public static void main(String[] args) throws FileNotFoundException {
        File obj = new File("THISINH.in") ;
        Scanner scanner = new Scanner(obj) ;
        int n = Integer.parseInt(scanner.nextLine()) ;
        List<Student> ls = new ArrayList<>() ; 
        for(int i = 0 ; i < n ; i++){
            String name = scanner.nextLine() ; 
            Double bas_point = Double.parseDouble(scanner.nextLine()) ;
            String ethnic = scanner.nextLine() ;
            String region = scanner.nextLine() ;
            ls.add(new Student(name, bas_point, ethnic, region)) ;
        }
        Collections.sort(ls);
        for(Student x : ls){
            System.out.println(x);
        }
    }
    
}