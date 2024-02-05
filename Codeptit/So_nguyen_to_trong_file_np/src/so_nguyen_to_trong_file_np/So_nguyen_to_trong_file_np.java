package so_nguyen_to_trong_file_np;

import java.io.* ;
import java.util.* ; 
public class So_nguyen_to_trong_file_np {

    public static boolean[] prime = new boolean[10000] ;
    public static void prime(){
        for(int i = 2 ; i < 10000 ; i++){
            prime[i] = true ; 
        }
        prime[0] = prime[1] = false ; 
        for(int i = 2 ; i <= 100 ; i++){
            if(prime[i]){
                for(int j = i*i ; j < 10000 ; j += i){
                    prime[j] = false ; 
                }
            }
        }
    }
    
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        prime() ; 
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SONGUYEN.in") ) ;
        List<Integer> ls = (List<Integer>) ois.readObject() ;
        int[] cnt = new int[10000] ; 
        Arrays.fill(cnt, 0) ;
        for(Integer i : ls){
            if(prime[i])
                cnt[i]++ ; 
        }
        for(int i = 2 ; i < 10000 ; i++){
            if(cnt[i] > 0){
                System.out.println(i + " " + cnt[i]);
                cnt[i] = 0 ;
            }
        }
    }
    
}
