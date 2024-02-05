package xau_con_lon_nhat;

import java.util.* ;

public class Xau_con_lon_nhat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ; 
        String inp = scanner.nextLine() ;
        Stack<Character> st = new Stack<>() ;
        for(int i = 0 ; i < inp.length() ; i++){
            while(st.size() > 0 && inp.charAt(i) > st.peek()){
                st.pop() ;
            }
            st.add(inp.charAt(i)) ;
        }
        List<Character> ls = new ArrayList<>() ; 
        while(st.size() > 0){
            ls.add(st.pop()) ;
        }
        for(int i = ls.size() - 1 ; i >= 0 ; i--){
            System.out.print(ls.get(i));
        }
        System.out.println("");
    }
    
}
