
package uoc_so_nguyen_to_lon_nhat;

import java.util.Scanner ;
public class Uoc_so_nguyen_to_lon_nhat {

    public static Scanner scanner = new Scanner(System.in) ;
    public static void main(String[] args) {
        int tests = scanner.nextInt() ; 
        while(tests-- > 0){
            long num = scanner.nextLong(), res = -1 ;
            while(num % 2 == 0){
                res = 2 ; 
                num /= 2 ;
            }
            for(long i = 3 ; i <= Math.sqrt(num) ; i += 2){
                while(num % i == 0){
                    if(i > res) res = i ;
                    num /= i ; 
                }
            }
            if(num > 1 && num > res){
                res = num ;
            }
            System.out.println(res);
        }
    }
    
}
