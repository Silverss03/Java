package kt1;

import java.util.* ; 
public class SoNguyen {
    private long n ; 

    public SoNguyen() {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Nhap so nguyen n:");
        n = Long.parseLong(scanner.nextLine()) ; 
    }
    
    public void tong(){
        System.out.println("Tong tu 1 den n:");
        long sum = 0 ;
        for(int i = 1 ; i <= n ; i++){
            sum += i ;
        }
        System.out.println(sum);
    }
    
    public void snt(){
        boolean prime[] = new boolean[(int)n + 1] ;
        for(int i = 0 ; i <= n ; i++){
            prime[i] = true ;
        }
        prime[0] = prime[1] = false ;
        for(int i = 2 ; i <= n ; i++){
            if(prime[i]){
                for(int j = i * i ; j <= n ; j += i){
                    prime[j] = false;
                }
            }
        }
        System.out.println("Day so nguyen to nho hon va bang n :");
        for(int i = 2 ; i <= n ; i++){
            if(prime[i]){
                System.out.println(i + " ");
            }
        }
    }
}
