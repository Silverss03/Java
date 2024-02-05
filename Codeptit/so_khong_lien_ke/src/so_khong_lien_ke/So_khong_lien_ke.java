
package so_khong_lien_ke;

import java.util.Scanner ; 
public class So_khong_lien_ke {

    public static Scanner scanner = new Scanner(System.in) ;
    
    public static boolean check(String s){
        int count = 0 ;
        for(int i = 0 ; i < s.length() -1; i++){
            if(Math.abs((int)s.charAt(i) - (int)s.charAt(i + 1)) != 2){
                return false ;
            }
            count += (int)(s.charAt(i) - '0') ;
        }
        count += (int)(s.charAt(s.length() - 1) - '0') ;
        if(count % 10 != 0) return false ;
        return true ;
    }
    public static void main(String[] args) {
        int tests = Integer.parseInt(scanner.nextLine()) ;
        while(tests-- > 0){
            String input = scanner.nextLine() ; 
            if(check(input)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
    
}
