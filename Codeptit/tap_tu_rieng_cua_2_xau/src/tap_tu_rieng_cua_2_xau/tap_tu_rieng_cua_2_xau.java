
package tap_tu_rieng_cua_2_xau;

import java.util.* ;
public class tap_tu_rieng_cua_2_xau {

    public static Scanner scanner = new Scanner(System.in) ;
    public static void main(String[] args) {
        int tests = Integer.parseInt(scanner.nextLine()) ;
        while(tests-- > 0){
            Map<String, Integer> mp = new HashMap<String, Integer>() ;
            String s1 = scanner.nextLine(); 
            String[] arr1 = s1.split("\\s") ;
            String s2 = scanner.nextLine() ;
            String[] arr2 = s2.split("\\s") ;
            String[] res = new String[200] ;
            TreeSet<String> ts = new TreeSet() ;
            for(int i = 0 ; i < arr2.length ; i++){
                int curr = mp.getOrDefault(arr2[i], 0);
                mp.put(arr2[i], curr + 1) ;
            }
            for(int i = 0 ; i < arr1.length ; i++){
                int curr = mp.getOrDefault(arr1[i], 0);
                if(curr == 0){
                    ts.add(arr1[i]) ;
                }
            }
            for(String val : ts){
                System.out.print(val + " ");
            }
            System.out.println("");
        }
    }
    
}
