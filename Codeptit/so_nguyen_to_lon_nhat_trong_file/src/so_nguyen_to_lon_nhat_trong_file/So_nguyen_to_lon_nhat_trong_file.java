package so_nguyen_to_lon_nhat_trong_file;

import java.io.* ; 
import java.util.* ;
public class So_nguyen_to_lon_nhat_trong_file {
    public static boolean[] prime = new boolean[1000001];
    public static void primes(){ 
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false ;
        for(int i = 2 ; i <= 1000 ; i++){
            if(prime[i]){
                for(int j = i*i ; j <= 1000000 ; j += i){
                    prime[j] = false ;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException{
        primes() ;
        FileInputStream obj = new FileInputStream("DATA.in") ;
        ObjectInputStream ois = new ObjectInputStream(obj) ; 
        List<Integer> arr = (ArrayList<Integer>) ois.readObject() ;
        int[] cnt = new int[1000001] ;
        int check = 10 ; 
        for(Integer x : arr){
            if(prime[x]){
                cnt[x]++ ;
            }
            
        }
        for(int i = 1000000 ; i >= 2 ; i--){
            if(cnt[i] > 0){
                System.out.println(i + " " + cnt[i]);
                check-- ;
                if(check == 0){
                    break ;
                }
            }
        }
    }
    
}
