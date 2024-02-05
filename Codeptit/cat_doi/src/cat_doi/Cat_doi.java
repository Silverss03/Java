
package cat_doi;

import java.util.Scanner ;

public class Cat_doi {
    
    public static Scanner scanner = new Scanner(System.in) ;
    public static void main(String[] args) {
        int tests = Integer.parseInt(scanner.nextLine()) ;
        while(tests-- > 0){
            long out = 0 ;
            boolean valid = true;
            String tmp = scanner.nextLine() ;
            for(int i = 0 ; i < tmp.length() ; i++){
                if(tmp.charAt(i) == '8' || tmp.charAt(i) == '9' || tmp.charAt(i) == '0'){
                    out = out * 10 ;
                }
                else if(tmp.charAt(i) == '1'){
                    out = out * 10 + 1 ;
                }
                else{
                    valid = false ;
                }
                
            }
            if(out == 0 || !valid){
                System.out.println("INVALID");
            }
            else{
                System.out.println(out);
            }
        }
    }
    
}
