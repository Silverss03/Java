package kt3;

import java.util.* ; 
public class SoNguyen {
    private final long n ; 

    public SoNguyen() {
        System.out.println("Nhap vao so nguyen n:");
        Scanner scanner = new Scanner(System.in) ;
        String inp = scanner.nextLine() ;
        n = Long.parseLong(inp) ;
    }
    
    public void chiaHet(){
        if(n < 7){
            System.out.println("Khong co so nho hon n chia het cho 7");
        }
        else{
            for(int i = 7 ; i <= n ; i += 7){
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }
    
    public void giaiThua(){
        System.out.println("n! co ket qua la:");
        long res = 1 ; 
        for(long i = 2 ; i <= n ; i++){
            res *= i ;
        }
        System.out.println(res);
    }
    
}
