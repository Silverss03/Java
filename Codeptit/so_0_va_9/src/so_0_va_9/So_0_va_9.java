/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package so_0_va_9;

import java.util.* ;
public class So_0_va_9 {

    public static Scanner scanner = new Scanner(System.in) ;
    public static void main(String[] args) {
        int tests = Integer.parseInt(scanner.nextLine()) ;
        while(tests-- > 0){
            int n = Integer.parseInt(scanner.nextLine()) ;
            Queue<Integer> qu = new LinkedList<>() ;
            qu.add(9) ;
            while(true){
                int tmp = qu.poll() ;
                if(tmp %  n == 0){
                    System.out.println(tmp);
                    break ;
                }
                qu.add(tmp * 10) ;
                qu.add(tmp * 10 + 9) ;
            }
        }
    }
    
}
