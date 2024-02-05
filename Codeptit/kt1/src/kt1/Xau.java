
package kt1;

import java.util.* ; 
public class Xau {
    private String s ;

    public Xau() {
        Scanner scanner = new Scanner(System.in) ; 
        s = scanner.nextLine() ; 
    }
    
    public void dai(){
        System.out.println("Do dai cua xau la:");
        System.out.println(s.length());
    }
    
    public void soCau(){
        int res = 0 ; 
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == '.' || s.charAt(i) == '!' || s.charAt(i) == '?'){
                res += 1 ;
            }
        }
        System.out.println("Xau co " + res + " cau");
    }
}
