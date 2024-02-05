package sap_xep_chen;

import java.util.* ;
public class Sap_xep_chen {

    public static Scanner scanner = new Scanner(System.in) ;
    public static void main(String[] args) {
        int n = scanner.nextInt(), index = 0 ;
        int[] arr = new int[n] ;
        int[] res = new int[n] ;
        for(int i = 0 ; i < n ; i++){
            arr[i] = scanner.nextInt() ;
        }
        for(int i = 0 ; i < n ; i++){
            System.out.print("Buoc " + i + ": ");
            index = i ;
            if(i == 0){
                res[index] = arr[i] ;
            }
            else{
                int ped = 0 ;
                for(int j = 0 ; j < index ; j++){
                    if(res[j] > arr[i]){
                        ped = 1 ;
                        for(int k = index ; k >= j + 1; k--){
                            res[k] = res[k - 1] ;
                        }
                        res[j] = arr[i] ;
                        break ;
                    }
                }
                if(ped == 0){
                    res[index] = arr[i] ;
                }
            }
            for(int j = 0 ; j <= index ; j++){
                System.out.print(res[j] + " ");
            }
            System.out.println("");
        }
    }
    
}
