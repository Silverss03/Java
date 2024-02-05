package kiem_tra_1;

import java.util.* ; 
import java.time.Year ;
public class Xau {
    private String name ; 
    private boolean gender ; 
    private int year,age  ;

    public Xau() {
        Scanner scanner = new Scanner(System.in) ; 
        System.out.println("Nhap vao 1 xau:");
        String s = scanner.nextLine()   ;
        String[] arr = s.split("\\s+\\|\\s+") ;
        name = arr[0] ;
        if(arr[1].equals("true")){
            gender = true ;
        }
        else{
            gender = false ;
        }
        year = Integer.parseInt(arr[2]) ;
        Year y = Year.now() ;
        age = Integer.parseInt(y.toString()) - year;
    } 
    
    public void chuanHoa(){
        String[] words = name.split("\\s+") ;
        String res = "" ;
        for (int i = 0 ; i < words.length - 1; i++) {
            res += words[i].substring(0, 1).toUpperCase();
            res += words[i].substring(1).toLowerCase();
            res += " " ;
        }
        res += words[words.length - 1].substring(0, 1).toUpperCase();
        res += words[words.length - 1].substring(1).toLowerCase();
        name = res ;
    }
    public void out(){
        if(gender){
            System.out.println("Mr " + name + ", " + age);
        }
        else{
            System.out.println("Miss " + name + ", " + age);
        }
        
    }
    
}
