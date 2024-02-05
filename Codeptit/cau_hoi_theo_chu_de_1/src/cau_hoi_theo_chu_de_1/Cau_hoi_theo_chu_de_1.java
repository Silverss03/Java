
package cau_hoi_theo_chu_de_1;

import java.util.* ;
public class Cau_hoi_theo_chu_de_1 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in) ;
       int n = Integer.parseInt(scanner.nextLine()) ;
       List<String> ls = new ArrayList<>();
       Map<String, Integer> mp = new HashMap<>() ;
       while(n > 0){
           String line = scanner.nextLine() ;
           if(!line.contains("?")){
               ls.add(line) ;
           }
           else{
               int cnt = mp.getOrDefault(ls.get(ls.size() - 1), 1) ; 
               
           }
       }
    }
    
}
