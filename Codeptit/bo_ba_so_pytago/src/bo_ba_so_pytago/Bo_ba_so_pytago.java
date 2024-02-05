package bo_ba_so_pytago;

import java.util.* ;

public class Bo_ba_so_pytago {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int tests = Integer.parseInt(scanner.nextLine()) ;
        while(tests-- > 0){
            boolean res = false ;
            Map<Long, Long>  mp = new HashMap<>() ;
            int n = Integer.parseInt(scanner.nextLine()) ;
            List<Long> ls = new ArrayList<>() ;
            for(int i = 0 ; i < n ; i++){
                Long tmp = scanner.nextLong() ;
                ls.add(tmp) ;
                if(mp.containsKey(tmp)){
                    mp.put(tmp, mp.get(tmp) + 1) ;
                }
                else{
                    mp.put(tmp, 1L) ;
                }
            }
            scanner.nextLine() ;
            for(int i = 0 ; i < n - 1; i++){
                for(int j = i + 1 ; j < n ; j++){
                    long a = (long) Math.sqrt(ls.get(i) * ls.get(i) + ls.get(j) * ls.get(j)) ;
                    if( a * a == ls.get(i) * ls.get(i) + ls.get(j) * ls.get(j) && mp.containsKey(a)){
                        res = true ;
                        break ;
                    }
                }
            }
            if(res){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}

//2
//5
//3 1 4 6 5
//3
//1 1 1
