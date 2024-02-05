package cap_so_nguyen_to_trong_file;

import java.io.* ; 
import java.util.* ;
public class Cap_so_nguyen_to_trong_file {
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

    public static void main(String[] args) throws ClassNotFoundException, IOException {
        primes() ;
        FileInputStream inp = new FileInputStream("DATA1.in") ;
        ObjectInputStream ois = new ObjectInputStream(inp) ; 
        List<Integer> arr1 = (ArrayList<Integer>) ois.readObject() ; 
        Set<Integer> ts = new TreeSet<>() ; 
        for(Integer x : arr1){
            if(prime[x] && x < 500000){
                ts.add(x) ;
            }
        }
        FileInputStream inp2 = new FileInputStream("DATA2.in") ;
        ObjectInputStream ois2 = new ObjectInputStream(inp2) ;
        List<Integer> arr2 = (ArrayList<Integer>) ois2.readObject() ;
        HashSet<Integer> st = new HashSet<>() ;
        for(Integer x : arr2){
            if(prime[x]){
                st.add(x) ;
            }
        }        
        for(Integer x : ts){
            Integer y = 1000000 - x ;
            if(st.contains(y)){
                System.out.println(x + " " + y);
            }
        }
    }
    
}
