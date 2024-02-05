
package boi_so_nho_nhat_cua_n_so_nguyen_duong_dau;

import java.util.Scanner ;
public class Boi_so_nho_nhat_cua_n_so_nguyen_duong_dau {

    public static Scanner scanner = new Scanner(System.in) ;
    public static long GCD(long a, long b){
        if(b == 0) return a ;
        return GCD(b, a%b) ;
    }
    
    public static void main(String[] args) {
        int tests = scanner.nextInt() ;
        while(tests-- > 0){
            int n = scanner.nextInt(); 
            long LCM = 1 ; 
            for(int i = 2 ; i <= n ; i++){
                LCM = (long)((LCM*i)/GCD( i, LCM)) ;
            }
            System.out.println(LCM);
        }
    }
    
}
