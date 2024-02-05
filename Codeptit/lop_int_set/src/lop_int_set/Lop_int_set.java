package lop_int_set;
import java.io.*;
import java.util.*;

class IntSet{
    private int[] arr ; 

    public IntSet(int[] arr) {
        this.arr = arr;
    }

    public int[] getArr() {
        return arr;
    }
    
    private boolean exist(int a, List<Integer> arr){
        for (int x : arr){
            if(x == a){
                return true ;
            }
        }
        return false ;
    }
    
    public IntSet union(IntSet b){
        int[] arr = b.getArr() ;
        List<Integer> ls = new ArrayList<Integer>() ; 
        for(int x : arr){
            if(!exist(x, ls)){
                ls.add(x );
            }
        }
        for(int x : this.arr){
            if(!exist(x, ls)){
                ls.add(x) ;
            }
        }
        Collections.sort(ls);
        int[] res = new int[ls.size()] ;
        for(int i = 0 ; i < ls.size() ; i++){
            res[i] = ls.get(i );
        }
        return new IntSet(res) ;
    }

    @Override
    public String toString() {
        String res = "" ; 
        for(int x : arr){
            res += Integer.toString(x) + " ";
        }
        return res ;
    }
    
    
}
public class Lop_int_set {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
    }
    
}
