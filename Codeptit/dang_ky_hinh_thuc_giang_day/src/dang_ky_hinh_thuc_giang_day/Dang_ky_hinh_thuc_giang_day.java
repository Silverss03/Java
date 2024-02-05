package dang_ky_hinh_thuc_giang_day;

import java.io.* ; 
import java.util.* ; 

class Subject{
    private String id, name, direct, prac ;
    private int num ;

    public Subject(String id, String name, int num, String direct, String prac) {
        this.id = id;
        this.name = name;
        this.direct = direct;
        this.prac = prac;
        this.num = num;
    }
    
    @Override
    public String toString(){
        return id + " " + name + " " + num + " " + direct + " " + prac ;
    }

    public String getId() {
        return id;
    }
    
    
}
public class Dang_ky_hinh_thuc_giang_day {

    public static void main(String[] args) {
       try{
           File obj = new File("MONHOC.in") ;
           Scanner scanner = new Scanner(obj) ; 
           int n = Integer.parseInt(scanner.nextLine()) ;
           List<Subject> ls = new ArrayList<>() ; 
           for(int i = 0 ; i < n ; i++){
               String id = scanner.nextLine() ; 
               String name = scanner.nextLine() ; 
               int num = Integer.parseInt(scanner.nextLine()) ;
               String direct = scanner.nextLine() ;
               String prac = scanner.nextLine() ;
               //System.out.println(prac);
               if(prac.equalsIgnoreCase("Truc tuyen" ) || prac.contains("ptit.edu.vn"))
                   ls.add(new Subject(id, name, num, direct, prac)) ;
           }
           ls.sort(new Comparator<Subject>(){
               @Override
               public int compare(Subject o1, Subject o2) {
                   return o1.getId().compareTo(o2.getId()) ;
               }
           });
           for(Subject x : ls){
               System.out.println(x);
           }
       }
       catch(FileNotFoundException e){
           
       }
    }
    
}
