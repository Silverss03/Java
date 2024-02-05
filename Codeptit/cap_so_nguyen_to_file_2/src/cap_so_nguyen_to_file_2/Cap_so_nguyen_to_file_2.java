/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cap_so_nguyen_to_file_2;

import java.util.*;
import java.io.*;



public class Cap_so_nguyen_to_file_2 {

    public static boolean[] prime = new boolean[1000001];
    public static void primes(){ 
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false ;
        for(int i = 2 ; i <= 1000 ; i++){
            if(prime[i]){
                for(int j = i*i ; j <= 1000000 ; j += i){
                    prime[j] = false ;
                }
            }
        }
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        primes() ;
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA1.in")) ; 
        List<Integer> arr1 = (ArrayList<Integer>) ois.readObject() ; 
        Set<Integer> ts = new TreeSet<>() ; 
        for(Integer x : arr1){
            if(prime[x]){
                ts.add(x) ;
            }
        }
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in")) ;
        List<Integer> arr2 = (ArrayList<Integer>) ois2.readObject() ;
        HashSet<Integer> st = new HashSet<>(arr2) ;   
        for(Integer x : ts){
            Integer y = 1000000 - x ;
            if(x >= y){
                break ;
            }
            if(!st.contains(y) && !st.contains(x) && ts.contains(y)){
                System.out.println(x + " " + y);
            }
        }
    }
    
}