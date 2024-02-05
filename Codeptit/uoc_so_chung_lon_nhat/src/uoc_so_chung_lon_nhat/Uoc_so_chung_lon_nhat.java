package uoc_so_chung_lon_nhat;

import java.util.* ; 

public class Uoc_so_chung_lon_nhat {

    public static int GCD(int a, int b){
        if(b == 0) return a ; 
        return GCD(b, a%b) ;
    }
    
    public static int LCM(int a, int b){
        return (a * b)/GCD(a,b) ;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int tests = Integer.valueOf(scanner.nextLine()) ; 
        while(tests-- > 0){
            int n = Integer.valueOf(scanner.nextLine()) ;
            int[] arr = new int[n] ;
            int[] res = new int[n + 1] ;
            for(int i = 0 ; i < n ; i++){
                arr[i] = scanner.nextInt() ;
            }
            scanner.nextLine() ;
            res[0] = arr[0] ;
            res[n] = arr[n - 1] ;
            for(int i = 1 ; i < n ; i++){
                res[i] = LCM(arr[i], arr[i - 1]) ;
            }
            for(Integer x : res){
                System.out.print(x + " ");
            }
            System.out.println("");
        }
    }
    
}
//2
//3
//1 2 3
//3
//5 10 5