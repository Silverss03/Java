package so_la_ma;

import java.util.* ;
public class So_la_ma {

    public static Long Switch(char c){
        if(c == 'I'){
            return 1L ; 
        }
        else if(c == 'V'){
            return 5L ;
        }
        else if(c == 'X'){
            return 10L ;
        }
        else if(c == 'L'){
            return 50L ;
        }
        else if(c == 'C'){
            return 100L ; 
        }
        else if(c == 'D'){
            return 500L ;
        }
        else{
            return 1000L ;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ; 
        int tests =  Integer.parseInt(scanner.nextLine()) ;
        while(tests-- > 0){
            String inp = scanner.nextLine() ; 
            Long num = 0L ; 
            int i = 0 ;
            while(i < inp.length()){
                if(i < inp.length() - 1  && inp.charAt(i) == 'I' && inp.charAt(i + 1) == 'V'){
                    num += 4 ;
                    i++ ;
                }
                else if(i < inp.length() - 1  && inp.charAt(i) == 'I' && inp.charAt(i + 1) == 'X'){
                    num += 9 ;
                    i++ ;
                }
                else if((i < inp.length() - 1  && inp.charAt(i) == 'X' && inp.charAt(i + 1) == 'L')){
                    num += 40 ;
                    i++ ;
                }
                else if((i < inp.length() - 1  && inp.charAt(i) == 'X' && inp.charAt(i + 1) == 'C')){
                    num += 90 ;
                    i++ ;
                }
                else if(i < inp.length() - 1  && inp.charAt(i) == 'C' && inp.charAt(i + 1) == 'D'){
                    num += 400 ;
                    i++ ;
                }
                else if(i < inp.length() - 1  && inp.charAt(i) == 'C' && inp.charAt(i + 1) == 'M'){
                    num += 900 ;
                    i++ ;
                }
                else{
                    num += Switch(inp.charAt(i)) ;
                }
                i++ ;
            }
            System.out.println(num);
        }
    }
    
}
