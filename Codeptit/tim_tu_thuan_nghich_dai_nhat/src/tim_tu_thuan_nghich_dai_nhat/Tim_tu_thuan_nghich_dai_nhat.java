package tim_tu_thuan_nghich_dai_nhat;

import java.util.* ; 

public class Tim_tu_thuan_nghich_dai_nhat {

    public static Boolean check(String s){
        int l = 0, r = s.length() - 1 ; 
        while(l < r){
            if(s.charAt(l) != s.charAt(r)){
                return false ;
            }
            l++; 
            r--;
        }
        return true ;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int longest = -1 ;
        Map<String, Integer> mp = new HashMap<>() ; 
        List<String> ls = new ArrayList<>() ; 
        List<String> res = new ArrayList<>() ; 
        while(scanner.hasNext()){
            String[] arr = scanner.nextLine().split("\\s+") ; 
            for(String x : arr){
                if(!mp.containsKey(x)){
                    mp.put(x, 1) ;
                }
                else{
                    int tmp = mp.get(x) ;
                    mp.put(x, tmp + 1) ;
                }
                if(check(x) && x.length() > longest){
                    longest = x.length() ;
                }
                ls.add(x) ;
            }
        }
        for(String x : ls){
            if(check(x) && x.length() == longest && !res.contains(x)){
                System.out.println(x + " " + mp.get(x));
                res.add(x) ;
            }
        }
        
    }
    
}
