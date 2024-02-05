/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package so_loc_phat;

import java.util.* ; 

public class So_loc_phat {

    public static Scanner scanner = new Scanner(System.in) ;
    public static void main(String[] args) {
        int tests = Integer.parseInt(scanner.nextLine()) ;
        while(tests-- > 0){
            int n = Integer.parseInt(scanner.nextLine()) ;
            Queue<String> qu = new LinkedList<>() ; 
            List<String> ls = new ArrayList<>() ; 
            qu.add("6") ;
            qu.add("8") ;
            while(true){
                String tmp = qu.poll() ;              
                if(tmp.length() > n){
                    break ; 
                }
                ls.add(tmp) ;
                qu.add(tmp + "6") ;
                qu.add(tmp + "8") ;
            }
            System.out.println(ls.size());
            for(int i = ls.size() - 1 ; i >= 0 ; i--){
                System.out.print(ls.get(i)+ " ");
            }
            System.out.println("");
        } 
    }
    
}
