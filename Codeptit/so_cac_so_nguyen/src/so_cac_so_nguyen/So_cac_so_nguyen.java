
package so_cac_so_nguyen;

import java.util.Scanner ;

public class So_cac_so_nguyen {

    public static Scanner scanner = new Scanner(System.in) ;
    public static void main(String[] args) {
        String num = scanner.nextLine() ;
        int cnt3 = 0, cnt5 = 0 ; 
        for(int i = 0 ; i < num.length() ; i++){
            if(num.charAt(i) == '3' ){
                cnt3++ ;
            }
            if(num.charAt(i) == '5'){
                cnt5++ ;
            }
        }
        if(cnt3 + cnt5 == 3 || cnt5 + cnt3 == 5){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    
}
