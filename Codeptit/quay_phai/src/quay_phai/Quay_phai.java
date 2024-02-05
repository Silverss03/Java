package quay_phai;

import java.util.* ;

public class Quay_phai {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ; 
        int tests = Integer.valueOf(scanner.nextLine()) ;
        while(tests-- > 0){
            int n = Integer.valueOf(scanner.nextLine()), res = 0 ;
            Long[] arr = new Long[n] ;
            for(int i = 0 ; i < n ; i++){
                arr[i] = scanner.nextLong() ;
            }
            scanner.nextLine() ;
            while(true){
                boolean done = true ;
                for(int i = 0 ; i < n - 1; i++){
                    if(arr[i] > arr[i + 1]){
                        done = false ;
                        Long tmp = arr[i] ; 
                        arr[i] = arr[i + 1] ; 
                        arr[i + 1] = tmp ; 
                    }
                }
                if(done){
                    break ;
                }
                else{
                    res++ ;
                }
            }
            System.out.println(res);
        }
    }
    
}
//2
//5
//5 1 2 3 4
//5
//1 2 3 4 5