
package thu_gon_day_so;

import java.util.Scanner ;
import java.util.ArrayList ;
import java.util.List ;
public class Thu_gon_day_so {

    public static Scanner scanner = new Scanner(System.in) ;
    public static void main(String[] args) {
        int n = scanner.nextInt() ;
        List<Integer> a = new ArrayList<>(n) ;
        for(int i = 0 ; i < n ; i++){
            a.add(scanner.nextInt()) ;
        }
        while(true){
            boolean stop = true ; 
            for(int i = 0 ; i < a.size() - 1 ; i++){
                if((a.get(i) + a.get(i + 1)) % 2 == 0){
                    a.remove(i) ;
                    a.remove(i) ;
                    i-- ;
                    stop = false ;
                }
            }
            if(stop){
                break ;
            }
        }
        System.out.println(a.size());
    }
    
}
