package kiem_tra_day_ngoac_dung;

import java.util.* ;

public class Kiem_tra_day_ngoac_dung {

    public static Scanner scanner = new Scanner(System.in) ;
    public static void main(String[] args) {
        int tests = Integer.parseInt(scanner.nextLine()) ;
        while(tests-- > 0){
            Boolean res = true ;
            String line = scanner.nextLine() ;
            Stack<Character> st = new Stack<>() ;
            for(int i = 0 ; i < line.length() ; i++){
                if(line.charAt(i) == '[' || line.charAt(i) == '(' || line.charAt(i)== '{'){
                    st.push(line.charAt(i)) ;
                }
                else{
                    Character tmp = line.charAt(i) ;
                    if(st.size() > 0 && st.peek() == '{' && tmp != '}'){
                        res = false; 
                    }
                    else if(st.size() > 0 && st.peek() == '[' && tmp != ']'){
                        res = false ;
                    }
                    else if(st.size() > 0 && st.peek() == '(' && tmp != ')'){
                        res = false ;
                    }
                    else{
                        if(st.size() > 0)
                            st.pop();
                        else
                            res = false ;
                    }
                }
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

//2
//[()]{}{[()()]()}
//[(])