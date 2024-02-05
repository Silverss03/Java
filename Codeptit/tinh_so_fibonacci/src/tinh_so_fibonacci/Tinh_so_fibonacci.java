
package tinh_so_fibonacci;
import java.util.Scanner ;
public class Tinh_so_fibonacci {

    public static void main(String[] args) {
       int tests ;
       Scanner scanner = new Scanner(System.in) ;
       tests = scanner.nextInt() ;
       while(tests-- > 0){
            long[] fib = new long[93] ;
            fib[1] = 1L ;
            fib[2] = 1L ;
            int n ;
            n = scanner.nextInt();
            for(int i = 3 ; i <= n ; i++){
                fib[i] = fib[i - 1] + fib[i - 2] ;
            }
            System.out.println(fib[n]) ;
       }
    }
    
}
