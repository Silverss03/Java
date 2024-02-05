package diem_can_bang;

import java.util.Scanner ;
public class Diem_can_bang {

    public static Scanner scanner = new Scanner(System.in) ;
    public static void main(String[] args) {
        int tests = scanner.nextInt() ;
        while(tests-- > 0){
            int n = scanner.nextInt(), sum_r = 0, res = -1 ;
            int[] arr = new int[n] ;
            for(int i = 0 ; i < n ; i++){
                arr[i] = scanner.nextInt() ;
                if(i != 0) sum_r += arr[i] ; 
            }
            int l = 1, sum_l = 0;
            while(l < n){
                if(sum_l == sum_r){
                    res = l ;
                    break ;
                }
                if(l >= 1){
                    sum_l += arr[l - 1] ;
                    sum_r -= arr[l] ;
                }
                l++ ;
            }
            System.out.println(res);
        }
    }
    
}
