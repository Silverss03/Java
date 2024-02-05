
package tinh_tong_n_so_nguyen_duong_dau_tien;

import java.util.Scanner ;
        
public class Tinh_tong_n_so_nguyen_duong_dau_tien {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int tests = scanner.nextInt() ;
        while(tests > 0){
            long n = scanner.nextLong() ;
            long res = (n*(1 + n))/2 ;
            System.out.println(res);
            tests-- ;
        }
        
    }
    
}
