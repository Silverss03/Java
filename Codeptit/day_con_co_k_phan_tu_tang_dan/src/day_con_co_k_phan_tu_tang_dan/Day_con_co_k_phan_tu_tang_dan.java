package day_con_co_k_phan_tu_tang_dan;

import java.util.* ;

public class Day_con_co_k_phan_tu_tang_dan {
    
    public static void act(int[] arr, int n, int k, int[] out, int i){
        for(int j = out[i - 1] + 1 ; j <= n ; j++){
            out[i] = j; 
            if(i == k){
                for(int m = 1 ; m <= k ; m++){
                    System.out.print(arr[out[m] - 1] + " ");
                }
                System.out.println("");
            }
            else{
                act(arr, n, k, out, i + 1) ;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int tests = Integer.parseInt(scanner.nextLine()) ;
        while(tests-- > 0){
            int n = scanner.nextInt() ; 
            int k = scanner.nextInt() ;
            scanner.nextLine() ;
            int[] arr = new int[n] ; 
            int[] out = new int[k + 1] ;
            for(int i = 0 ; i < n ; i++){
                arr[i] = scanner.nextInt() ;
            }
            scanner.nextLine() ;
            Arrays.sort(arr);
            act(arr, n, k , out, 1) ;
        }
    }
    
}
