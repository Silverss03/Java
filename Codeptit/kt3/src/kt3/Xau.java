
package kt3;

import java.util.* ;
public class Xau {
    private final String s  ;

    public Xau() {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Nhap vao 1 xau");
        s = scanner.nextLine() ; 
    }
    
    public void email(){
        String[] arr = s.split("\\s+") ;
        String res = "" ;
        res += arr[arr.length - 1].substring(0,1).toUpperCase() + arr[arr.length - 1].substring(1).toLowerCase() ;
        for(int i = 0 ; i < arr.length - 1 ; i++){
            res += arr[i].substring(0,1).toUpperCase() ;
        }
        System.out.println(res);
        System.out.println(res +"@stu.ptit.vn");
    }
    
    public void tach(){
        String regex = "//d+" ;
        String[] arr = s.split(regex) ; 
        for(String i : arr){
            System.out.print(i +" ");
        }
        System.out.println("");
    }
}
