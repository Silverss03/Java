package ten_viet_tat;

import java.io.* ; 
import java.util.* ; 
public class Ten_viet_tat {

    public static void main(String[] args) {
        File obj = new File("DANHSACH.in") ;
        try{
            Map<String, String> mp = new HashMap<>() ;
            Scanner scanner = new Scanner(obj) ;
            int n = Integer.parseInt(scanner.nextLine()) ;
            List<String> ls = new ArrayList<>() ;
            for(int i = 0 ; i < n ; i++){
                String tmp = "" ; 
                String line = scanner.nextLine() ;
                String[] arr = line.split("\\s+") ;
                for(String x : arr){
                    tmp += x.substring(0, 1) ;
                }
                mp.put(tmp, line) ;
                ls.add(tmp) ;
            }
            n = Integer.parseInt(scanner.nextLine()) ;
            for(int i = 0 ; i < n ; i++){
                String tmp = scanner.nextLine() ;
                String arr[] = tmp.split("[.]") ;
                String code = "" ; 
                for(String x : arr){
                    code += x ;
                }
                for(String x : ls){
                    boolean check = true ; 
                    if(x.length() != code.length()){
                        continue ;
                    }
                    else{
                        for(int j = 0 ; j < x.length() ; j++){                        
                            if(code.charAt(j) == '*'){
                                continue ;
                            }
                            else{                            
                                if(code.charAt(j) != x.charAt(j)){
                                    check = false ;
                                }
                            }
                        }
                        if(check){
                            System.out.println(mp.get(x));
                        }  
                    } 
                }
            }
        }
        catch(FileNotFoundException e){
            
        }
    }
    
}
