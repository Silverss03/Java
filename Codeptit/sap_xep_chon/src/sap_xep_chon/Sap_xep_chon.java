/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sap_xep_chon;

import java.util.Scanner ;

public class Sap_xep_chon {

    public static Scanner scanner = new Scanner(System.in) ;
    public static void main(String[] args) {
        int n = scanner.nextInt() ;
        int[] arr = new int[n] ;
        for(int i = 0 ; i < n ; i++){
            arr[i] = scanner.nextInt() ;
        }
        for(int i = 0 ; i < n - 1 ; i++){
            System.out.print("Buoc " + (i + 1) + ": ");
            int pos = i ;
            for(int j = i + 1 ; j < n ; j++){
                if(arr[pos] > arr[j]){
                    pos = j ;
                }
            }
            int tmp = arr[pos] ;
            arr[pos] = arr[i] ;
            arr[i] = tmp ;
            for(int j = 0 ; j < n ; j++){
                System.out.print(arr[j] + " ") ;
            }
            System.out.println("");
        }
    }
    
}
