package xau_nhi_phan;

import java.util.Scanner ;

public class Xau_nhi_phan {

    public static Scanner scanner = new Scanner(System.in) ;
    public static long F[] = new long[93] ;
    public static char fib(int n, long k){
        if(n == 1) return '0' ;
        if(n == 2) return '1' ;
        if(k <= F[n - 2]) return fib(n - 2, k) ;
        return fib(n - 1, k - F[n - 2]) ;
    }
    
    public static void main(String[] args) {
        F[1] = 1 ;
        F[2] = 1 ;
        for(int i = 3 ; i < 93 ;i++){
            F[i] = F[i - 1] + F[i - 2] ;
        }
        int tests = scanner.nextInt() ;
        while(tests-- > 0){
            int n = scanner.nextInt() ;
            long k = scanner.nextLong() ;
            System.out.println(fib(n, k));
        }
    }
    
}
