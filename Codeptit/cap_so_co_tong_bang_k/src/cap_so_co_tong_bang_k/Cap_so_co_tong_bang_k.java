package cap_so_co_tong_bang_k;

import java.util.* ; 

public class Cap_so_co_tong_bang_k {

    public static Scanner scanner = new Scanner(System.in) ;
    public static void main(String[] args) {
        int tests = Integer.parseInt(scanner.nextLine()) ;
        while(tests-- > 0){
            int n = scanner.nextInt() ;
            int k = scanner.nextInt() ;
            Long res = 0L ;
            Map<Long, Integer> mp = new HashMap<>() ;
            Long[] arr = new Long[n] ;
            for(int i = 0 ; i < n ; i++){
                arr[i] = scanner.nextLong() ;
                if(mp.containsKey(arr[i])){
                    int cnt = mp.getOrDefault(arr[i], 1) + 1;
                    mp.put(arr[i], cnt) ;
                }
                else{
                    mp.put(arr[i], 1) ;
                }
            }
            for(Long x : arr){
                Long tmp = k - x ;
                if(mp.containsKey(tmp)){
                    if(tmp == x){
                        res += mp.get(tmp) - 1 ;
                    }
                    else{
                        res += mp.get(tmp) ;
                    }
                }
            }
            System.out.println(res/2);
        }
    }   
}
//4
//4 6
//1 5 7 -1
//5 6
//1 5 7 -1 5
//4 2
//1 1 1 1
//13 11
//10 12 10 15 -1 7 6 5 4 2 1 1 1