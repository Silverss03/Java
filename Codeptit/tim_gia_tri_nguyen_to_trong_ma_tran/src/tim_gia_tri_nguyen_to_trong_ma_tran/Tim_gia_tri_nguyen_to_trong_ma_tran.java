
package tim_gia_tri_nguyen_to_trong_ma_tran;

import java.util.* ;
public class Tim_gia_tri_nguyen_to_trong_ma_tran {

    public static Scanner scanner = new Scanner(System.in) ;
    public static boolean prime(long a){
        if(a < 2){
            return false;
        }
        if(a % 2 == 0 && a != 2){
            return false; 
        }
        for(int i = 3 ; i * i <= a ; i+= 2){
            if(a % i == 0){
                return false;
            }
        }
        return true ;
    }
    
    public static void main(String[] args) {
        int tests = scanner.nextInt() ;
        for(int t = 1 ; t <= tests ; t++){
            HashMap<Long, Integer> mp = new HashMap<Long, Integer>() ;
            int n = scanner.nextInt() ;
            int m = scanner.nextInt() ; 
            ArrayList<Long> arr = new ArrayList<Long>() ; 
            for(int i = 0 ; i < n ; i++){
                for(int j = 0 ; j < m ; j++){
                    long tmp = scanner.nextLong() ;
                    Integer cnt = mp.getOrDefault(tmp, 1) ;
                    if(cnt == 1 && prime(tmp))    
                        arr.add(tmp) ;
                    mp.put(tmp, cnt + 1) ;
                }
            }
            System.out.println("Test " + t + ":");
            for(Long x : arr){
                System.out.print(x + " ");
            }
            System.out.println("");
        }
    }
    
}
