
package bien_so_dep;

import java.util.Scanner ; 

public class Bien_so_dep {

    public static Scanner scanner = new Scanner(System.in) ;
    public static void main(String[] args) {
        int tests = Integer.parseInt(scanner.nextLine()) ;       
        while(tests-- > 0){
            boolean inc = true, equal = true, se = true, three_first = true, two_end = true ;
            String sign = scanner.nextLine() ;
            char curr = sign.charAt(7) ;
            for(int i = 5 ; i < 7; i++){
                if(sign.charAt(i) >= sign.charAt(i + 1)){
                    inc = false ;
                }
                if(sign.charAt(i) != sign.charAt(i + 1) ){
                    equal = false ;
                    three_first = false ;
                }
                if(sign.charAt(i) != '8' && sign.charAt(i) != '6' && sign.charAt(i) != '.'){
                    se = false ;
                }
            }
            if(sign.charAt(9) >= sign.charAt(10) || sign.charAt(9) <= curr){
                inc = false ;
            }
            if(sign.charAt(9) != sign.charAt(10) ){
                equal = false ;
                two_end = false ;
            }
            if(sign.charAt(10) != '8' && sign.charAt(10) != '6' ){
                se = false ;
            }
            if(inc == false && equal == false && (three_first == false || two_end == false) && se == false){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
    }
    
}
