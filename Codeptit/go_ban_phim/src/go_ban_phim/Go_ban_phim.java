/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package go_ban_phim;

import java.util.* ; 
public class Go_ban_phim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        String s = scanner.nextLine() ;
        Stack<Character> st1 = new Stack<>() ;
        Stack<Character> st2 = new Stack<>() ;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == '<'){
                if(st1.size() > 0){
                    st2.push(st1.peek()) ;
                    st1.pop() ;
                }
            }
            else if(s.charAt(i) == '>'){
                if(st2.size() > 0){
                    st1.push(st2.peek()) ;
                    st2.pop() ;
                }
            }
            else if(s.charAt(i) == '-'){
                if(st1.size() > 0){
                    st1.pop() ;
                }
            }
            else{
                st1.push(s.charAt(i)) ;
            }
        }
        while(st1.size() > 0){
            st2.push(st1.peek()) ;
            st1.pop() ;
        }
        while(st2.size() > 0){
            System.out.print(st2.peek());
            st2.pop() ;
        }
    }
    
}
