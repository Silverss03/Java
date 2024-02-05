/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package day_con_co_tong_nguyen_to;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Day_con_co_tong_nguyen_to {

    public static List<String> res = new ArrayList<>();
    public static boolean check(int n){
        if(n < 2){
            return false ;
        }
        for(int i = 2 ; i <= (int)Math.sqrt(n) ; i++){
            if(n % i == 0){
                return false; 
            }
        }
        return true ;
    }
    
    public static void act(int[] arr, int n, int i, List<Integer> ls){
        for(int j = 0 ; j <= 1 ; j++){
            arr[i] = j ; 
            if(i != n - 1)
                act(arr, n, i + 1, ls) ;
            else{
                int sum = 0 ; 
                for(int k = 0 ; k < n ;k++){
                    sum += ls.get(k) * arr[k];
                }
                if(check(sum)){
                    String tmp = "" ;
                    for(int k = 0; k < n; k++){
                        if(arr[k] == 1){
                            tmp += Integer.toString(ls.get(k)) + " ";
                        }
                    }
                    res.add(tmp) ;
                }
                
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int tests = Integer.parseInt(scanner.nextLine()) ;
        while(tests-- > 0){
            res.clear() ;
            int n = Integer.parseInt(scanner.nextLine()) ;
            List<Integer> ls = new ArrayList<>() ;
            for(int i = 0 ; i < n ; i++){
                ls.add(scanner.nextInt()) ;
            }
            scanner.nextLine() ;
            Collections.sort(ls);
            int[] arr = new int[n] ;
            Collections.sort(ls, new Comparator<Integer>(){
                @Override
                public int compare(Integer o1, Integer o2) {
                    return Integer.compare(o2, o1);
                }
                
            });
            act(arr, n, 0, ls) ;
            for(String x : res){
                System.out.println(x);
            }
        }   
    }
    
}
