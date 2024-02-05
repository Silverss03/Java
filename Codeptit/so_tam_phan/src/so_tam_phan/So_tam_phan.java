
package so_tam_phan;

import java.util.Scanner ;

public class So_tam_phan {

    public static Scanner scanner = new Scanner(System.in) ;
    public static void main(String[] args) {
        int tests = Integer.parseInt(scanner.nextLine()) ; 
        while(tests-- > 0){
            String inp = scanner.nextLine() ;
            boolean res = true ;
            for(int i = 0 ; i < inp.length() ; i++){
                if(inp.charAt(i) != '0' && inp.charAt(i) != '1' && inp.charAt(i) != '2') res = false ;
            }
            if(res) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
}
