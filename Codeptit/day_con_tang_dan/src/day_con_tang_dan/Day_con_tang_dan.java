package day_con_tang_dan;

import java.io.* ;
import java.util.* ;
public class Day_con_tang_dan {

    public static void bin(int i, int n, int[]arr, int[] bin, List<String> l){
        for(int j = 0 ; j <= 1 ; j++){
            bin[i] = j ;
            if(i == n - 1){
                String res = "" ; 
                int cnt = 0 ; 
                boolean check = true ;
                List<Integer> tmp = new ArrayList<>() ;
                for(int k = 0 ; k < n ; k++){
                    if(bin[k] == 1){
                        cnt++ ; 
                        tmp.add(arr[k]) ;
                        res += Integer.toString(arr[k]) + " " ;
                    }
                }
                for(int k = 0 ; k < tmp.size() - 1; k++){
                    if(tmp.get(k) > tmp.get(k + 1)){
                        check = false ; 
                    }
                }
                if(cnt > 1 && check){
                    l.add(res) ;
                }
            }
            else{
                bin(i + 1, n , arr, bin, l) ;
            }
        }
    }
    public static void main(String[] args) {
        try{
            File obj = new File("DAYSO.in") ;
            Scanner scanner = new Scanner(obj) ;
            int n = Integer.parseInt(scanner.next()) ;
            int[] arr = new int[n] ;
            for(int i = 0 ; i < n ; i++){
                arr[i] = Integer.parseInt(scanner.next()) ;
            }
            int[] bin = new int[n] ;
            List<String> l = new ArrayList<>() ; 
            bin(0,n,arr,bin,l) ;
            Collections.sort(l);
            for(String i : l){
                System.out.println(i);
            }
        }
        catch(FileNotFoundException e){
            
        }
    }
    
}
