/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dau_tu_chung_khoan;

import java.util.* ;
public class Dau_tu_chung_khoan {

    public static Scanner scanner = new Scanner(System.in) ;
    public static void main(String[] args) {
        int tests = Integer.parseInt(scanner.nextLine()) ;
        while(tests-- > 0){
            int n = Integer.parseInt(scanner.nextLine()) ;
            Stack<Integer> st = new Stack<>() ;
            int[] arr = new int[n + 1] ; 
            int[] res = new int[n + 1] ;
            Map<Integer,Integer> mp = new HashMap<>() ;
            for(int i = 0 ; i < n ; i++){
                arr[i] = scanner.nextInt() ;
            }
            mp.put(arr[0], 1 ) ;
            st.add(arr[0]) ;           
            res[0] = 1;
            for(int i = 1 ; i < n ; i++){
                res[i] = 1;
                while(st.size() > 0 && st.peek() <= arr[i]){
                    res[i] += mp.get(st.peek()) ;
                    st.pop() ;
                }
                mp.put(arr[i], res[i]) ;
                st.add(arr[i] );
            }
            for(int i = 0 ; i < n ; i++){
                System.out.print(res[i] + " ");
            }
            System.out.println("");
        }
    }
    
}

