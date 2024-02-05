package tre_nhat_gia_nhat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.* ; 

class Person{
    private String name, b_day ; 

    public Person(String name, String b_day) {
        this.name = name;
        this.b_day = b_day;
    }

    public String getB_day() {
        return b_day;
    }
    
    public String toString(){
        return name ;
    }
}
public class Tre_nhat_gia_nhat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int n = Integer.parseInt(scanner.nextLine()) ;
        List<Person> ls = new ArrayList<>() ; 
        int max = -1 ;
        for(int i = 0 ; i < n ; i++){
            String name = scanner.next() ; 
            String b_day = scanner.next() ;    
            ls.add(new Person(name, b_day)) ;
        }
        ls.sort(new Comparator<Person>(){
            @Override
            public int compare(Person o1, Person o2) {
                String[] arr1 = o1.getB_day().split("[\\/]") ;
                String[] arr2 = o2.getB_day().split("[\\/]") ;
                String y1 = arr1[2] ;
                String y2 = arr2[2] ;
                String m1 = arr1[1] ;
                String m2 = arr2[1] ;
                String d1 = arr1[0] ; 
                String d2 = arr2[0] ;
                if(y1.equalsIgnoreCase(y2)){
                    if(m1.equalsIgnoreCase(m2)){
                        return d1.compareTo(d2) ;
                    }
                    else{
                        return m1.compareTo(m2) ;
                    }
                }
                else{
                    return y1.compareTo(y2) ;
                }
            }
            
        });
        System.out.println( ls.get(ls.size() - 1));
        System.out.println(ls.get(0));
    }
    
}
//5
//Nam 01/10/1991
//An 30/12/1990
//Binh 15/08/1993
//Tam 18/09/1990
//Truong 20/09/1990