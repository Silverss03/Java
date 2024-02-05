
package kt2;

import java.util.* ; 
public class Xau {
    private String s ; 

    public Xau() {
        Scanner scanner = new Scanner(System.in) ; 
        s = scanner.nextLine()  ;
    }
    
    public void doDai(){
        System.out.println(s.length());
    }
    public void tachTu(){
        String arr[] = s.split("//s+") ;
        System.out.println("Cac tu trong xau gom:");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i]);
        }
    } 
}
