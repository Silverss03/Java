
package tinh_luy_thua;

import java.util.Scanner ; 

public class Tinh_luy_thua {

    public static Scanner scanner = new Scanner(System.in) ;
    public static final int MODULO = (int)(1e9 + 7) ;
    public static long pow(long a, long b){
        if(b == 0) return 1 ;
        if(b == 1) return a % MODULO;
        long tmp = pow(a, b/2) ;
        if(b % 2 == 0){
            return (tmp * tmp)%MODULO ;
        }
        return ((tmp * tmp)%MODULO * a) % MODULO ;           
    }
    
    public static void main(String[] args) {
        while(true){
            long a = scanner.nextLong() ;
            long b = scanner.nextLong() ; 
            if(a == b && b == 0){
                return ;
            }
            System.out.println((pow(a,b)));
        }
    }
    
}
