
package sap_xep_doi_cho_truc_tiep;

import java.util.Scanner ;
public class Sap_xep_doi_cho_truc_tiep {

    public static Scanner scanner = new Scanner(System.in) ;
    public static void main(String[] args) {
        int n = scanner.nextInt() ;
        int[] arr = new int[n] ;
        for(int i = 0 ; i < n ; i++){
            arr[i] = scanner.nextInt() ;
        }
        for(int i = 0 ; i < n - 1 ; i++){
            System.out.print("Buoc " + (i + 1) + ": ");
            for(int j = i + 1 ; j < n ; j++){
                if(arr[i] > arr[j]){
                    int tmp = arr[i] ;
                    arr[i] = arr[j] ;
                    arr[j] = tmp ;
                }
            }
            for(int j = 0 ; j < n ; j++){
                System.out.print(arr[j] + " ") ;
            }
            System.out.println("");
        }
    }
    
}
