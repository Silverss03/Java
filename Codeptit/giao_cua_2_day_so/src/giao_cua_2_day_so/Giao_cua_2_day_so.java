
package giao_cua_2_day_so;

import java.util.* ;
import java.util.Arrays;

public class Giao_cua_2_day_so {

    public static Scanner scanner = new Scanner(System.in) ;
    public static void main(String[] args) {
        int m , n ;
        m = scanner.nextInt() ;
        n = scanner.nextInt() ; 
        int[] arr1 = new int[m] ;
        int[] arr2 = new int[n] ;
        int[] count = new int[1002] ;
        for(int i = 0 ; i < m ; i++){
            arr1[i] = scanner.nextInt() ;
            count[arr1[i]] = 1 ;
        }
        for(int i = 0 ; i < n ; i++){
            arr2[i] = scanner.nextInt() ;
        }
        Arrays.sort(arr2);
        for(int i : arr2){
            if(count[i] == 1){
                System.out.print(i + " ");
                count[i] = 2 ;
            }
        }
    }
    
}
