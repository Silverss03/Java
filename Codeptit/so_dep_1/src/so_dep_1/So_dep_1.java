
package so_dep_1;

import java.util.Scanner ;
public class So_dep_1 {

    public static Scanner scanner = new Scanner(System.in) ;
    public static void main(String[] args) {
        int tests = Integer.parseInt(scanner.nextLine()) ;
        while(tests-- > 0){
             String inp = scanner.nextLine() ;
             int n = inp.length() - 1 ;
             String rev = "" ;
             int ok = 1 ;
             for(int i = 0 ; i <= n ; i++){
                 rev = rev + inp.charAt(n - i) ;
                 if((int)inp.charAt(i) % 2 != 0){
                     ok = 0 ;
                     break ;
                 }
             }
             if(ok == 1 && rev.equals(inp)){
                 System.out.println("YES");
             }
             else{
                 System.out.println("NO");
             }
        }
    }
    
}
