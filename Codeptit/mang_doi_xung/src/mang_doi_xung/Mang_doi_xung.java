/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mang_doi_xung;

import java.util.Scanner ;
public class Mang_doi_xung {

    public static Scanner scanner = new Scanner(System.in) ;
    public static void main(String[] args) {
        int tests = Integer.parseInt(scanner.nextLine()) ;
        while(tests-- > 0){
            boolean res = true ;
            int n = scanner.nextInt() ;
            int[] arr = new int[102];
            for(int i = 0 ; i < n ; i++){
                arr[i] = scanner.nextInt() ;
            }
            int l = 0 ;
            int r = n - 1 ; 
            while(l < r ){
                if(arr[l] != arr[r]){
                    res = false ;
                    break ;
                }
                l++ ;
                r-- ;
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
