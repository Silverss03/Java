/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package phan_tu_dau_tien_ben_phai_lon_hon;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Admin
 */
public class Phan_tu_dau_tien_ben_phai_lon_hon {

    public static Scanner scanner = new Scanner(System.in) ;
     public static void main(String[] args) {
        int tests = Integer.parseInt(scanner.nextLine()) ;
        while(tests-- > 0){
            int n = Integer.parseInt(scanner.nextLine()) ;
            int[] arr = new int[n] ;
            int[] res = new int[n] ;
            for(int i = 0 ; i < n ;i++){
                arr[i] = scanner.nextInt() ;
            }
            scanner.nextLine() ;
            Stack<Integer> st = new Stack<>() ;
            st.add(arr[n - 1]) ;
            res[n - 1] = -1 ; 
            for(int i = n - 2; i >= 0 ; i--){
                while(st.size() > 0 && arr[i] >= st.peek()){
                    st.pop() ;
                }
                if(st.size() == 0){
                    res[i] = -1 ;
                }
                else{
                    res[i] = st.peek() ;
                }
                st.add(arr[i]) ;
            }
            for(int i = 0 ; i < n ; i++){
                System.out.print(res[i] + " ");
            }
            System.out.println("");
        }
    }
    
}
