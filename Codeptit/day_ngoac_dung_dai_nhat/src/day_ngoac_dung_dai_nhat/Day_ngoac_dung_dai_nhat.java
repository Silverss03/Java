package day_ngoac_dung_dai_nhat;

import java.util.* ;

public class Day_ngoac_dung_dai_nhat {
    
    public static Scanner scanner = new Scanner(System.in) ;
    public static void main(String[] args) {
        int tests = Integer.parseInt(scanner.nextLine()) ;
        while(tests-- > 0){
            int res = -1 ;
            String s = scanner.nextLine() ; 
            Stack<Integer> st = new Stack<>() ;
            st.push(-1) ;
            for(int i = 0 ; i < s.length() ; i++){
                if(s.charAt(i) == '('){
                    st.push(i) ;
                }
                else{
                    st.pop() ; 
                    if(st.size() > 0){
                        res = Integer.max(res, i - st.peek()) ;
                    }
                    if(st.size() == 0){
                        st.push(i) ;
                    }
                }
            }
            System.out.println(res);
        }
        
    }   
}

//3
//((()
//)()())
//()(()))))
