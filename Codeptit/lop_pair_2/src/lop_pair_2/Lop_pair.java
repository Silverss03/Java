package lop_pair_2;

import java.io.* ; 
import java.util.* ;

class Pair<a,b>{
    private a first ; 
    private b second ;

    public Pair(a first, b second) {
        this.first = first;
        this.second = second;
    }
    
    private boolean prime(int n){
        if(n < 2){
            return false ;
        }
        for(int i = 2 ; i*i <= n ; i++){
            if(n % i == 0){
                return false ;
            }
        }
        return true ;
    }
    
    public boolean isPrime(){
        return prime((Integer) first) &&  prime((Integer) second) ;
        
    }
    @Override
    public String toString(){
        return first + " " + second ;
    }
}

public class Lop_pair {
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}
