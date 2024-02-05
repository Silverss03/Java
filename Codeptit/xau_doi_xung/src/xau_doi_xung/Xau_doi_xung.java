
package xau_doi_xung;

import java.util.Scanner ;
public class Xau_doi_xung {

    public static Scanner scanner = new Scanner(System.in) ;
    public static void main(String[] args) {
        int tests = Integer.parseInt(scanner.nextLine()) ;
        while(tests-- > 0){
            String str = scanner.nextLine() ;
            int l = 0 ;
            int r = str.length() - 1 ;
            int changes = 0 ; 
            while(l < r){
                if(str.charAt(l) != str.charAt(r)){
                    changes++ ;
                }
                l++ ;
                r-- ;
            }
            if(changes == 1){
                System.out.println("YES");
            }
            else if(changes > 1){
                System.out.println("NO");
            }
            else{
                if(str.length() % 2 == 0){
                    System.out.println("NO");
                }
                else{
                    System.out.println("YES");
                }
            }
        }
    }
    
}
