
package so_chinh_phuong;

import java.util.Scanner ; 

public class So_chinh_phuong {

    public static Scanner scanner = new Scanner(System.in) ;
    public static void main(String[] args) {
        int tests = scanner.nextInt() ;
        while(tests-- > 0){
            int n = scanner.nextInt() ;
            if((double)(Math.sqrt(n)) == (int)(Math.sqrt(n))){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
    
}
