
package sap_xep_noi_bot;

import java.util.Scanner ;
public class Sap_xep_noi_bot {

    public static Scanner scanner = new Scanner(System.in) ;
    public static void main(String[] args) {
        int n = scanner.nextInt(), step = 1 ;
        int[] arr = new int[n] ;
        for(int i = 0 ; i < n ; i++){
            arr[i] = scanner.nextInt() ;
        }
        while(true){
            System.out.print("Buoc " + step + ": ");
            boolean sorted = true ;
            for(int i = 1 ; i < n ; i++){
                if(arr[i] < arr[i - 1]){
                    int tmp = arr[i] ;
                    arr[i] = arr[i - 1] ;
                    arr[i - 1] = tmp ;
                }
            }
            for(int i = 0 ; i < n ; i++){
                if(i > 0 && arr[i] < arr[i - 1]){
                    sorted = false ;
                }
                System.out.print(arr[i] + " ");
            }
            if(sorted) break ;
            step++ ;
            System.out.println("");
        }
    }
    
}
