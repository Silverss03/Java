
package tong_giai_thua;

import java.util.Scanner ;
public class Tong_giai_thua {

    public static Scanner scanner = new Scanner(System.in) ;
    public static void main(String[] args) {
        long n = scanner.nextInt() ;
        long res = 0 ;
        long curr = 1 ;
        for(int i = 1 ; i <= n ; i++){
            curr *= i ;
            res += curr ; 
        }
        System.out.println(res);
    }
    
}
