package tong_uoc_so_1;

import java.util.Scanner ; 
public class Tong_uoc_so_1 {
    public static Scanner scanner = new Scanner(System.in) ;
    public static final int N = (int)2e6 ;
    public static int[] prime = new int[N + 5] ;
    public static void find_min_div(){
        for(int i = 2 ; i*i <= N ; i++){
            if(prime[i] == 0){
                for(int j = i ; j <= N ; j+=i){
                    if(prime[j] == 0){
                        prime[j] = i ;
                    }
                }
            }
        }
        for(int i = 2 ; i <= N ; i++){
            if(prime[i] == 0){
                prime[i] = i ;
            }
        }
    }
    public static int cal(int n){
        if(prime[n] == 0){
            return n ;
        }
        int sum = 0 ;
        while(n != 1){
            sum += prime[n] ; 
            n /= prime[n] ;
        }
        return sum ;
    }
    
    public static void main(String[] args) {
        find_min_div() ;
        int n = scanner.nextInt() ;
        long res = 0 ;
        while(n-- > 0){
            int num = scanner.nextInt() ;
            res += cal(num) ;
        }
        System.out.println(res);
    }
    
}
