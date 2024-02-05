package day_con_lien_tiep_tong_bang_k;

import java.util.* ;

public class Day_con_lien_tiep_tong_bang_k {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ; 
        int tests = scanner.nextInt() ;
        while(tests-- > 0){
            int n = scanner.nextInt() ;
            long k = scanner.nextLong() ; 
            long[] arr = new long[n] ;
            for(int i = 0 ; i < n ; i++){
                arr[i] = scanner.nextLong() ;
            }
            boolean res = false ;
            int l = 0, r = 0 ;
            Long sum = arr[0] ;
            while(l < n){
                if(sum == k){
                    res = true ;
                    break ;
                }
                if(l == r || sum < k){
                    r++ ;
                    if(r == n) break ; 
                    sum += arr[r] ;
                }else if(sum > k){
                    sum -= arr[l] ;
                    l++ ;
                }
            }
            if(res){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}

//3
//6 33
//1 4 20 3 10 5
//7 7
//1 4 0 0 3 10 5
//2 0
//1 4
