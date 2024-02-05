package xau_day_du;

import java.util.* ;

public class Xau_day_du {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ; 
        int tests = Integer.parseInt(scanner.nextLine()) ;
        String alphabets = "abcdefghijklmnopqrstuvwxyz" ;
        while(tests-- > 0){
            String inp = scanner.nextLine() ;
            int k = Integer.parseInt(scanner.nextLine()) ;
            Set<Character> st = new HashSet<>() ;
            for(int i = 0 ; i < inp.length() ; i++){
                if(alphabets.indexOf(inp.charAt(i)) != -1 ){
                    st.add(inp.charAt(i));
                }
            }
            int l = st.size() ;
            int fixs = inp.length() - l ; //chỗ còn để sửa
            int remains = 26 - l ;    // số từ cần thêm
            if(remains <= fixs && remains <= k){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
    
}

//2
//qwqqwqeqqwdsdadsdasadsfsdsdsdasasas
//4
//qwqqwqeqqwdsdadsdasadsfsdsdsdasasas
//24