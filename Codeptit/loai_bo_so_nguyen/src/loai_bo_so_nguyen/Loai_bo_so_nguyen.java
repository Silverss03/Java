package loai_bo_so_nguyen;

import java.io.* ; 
import java.math.BigInteger;
import java.util.* ; 

public class Loai_bo_so_nguyen {

    public static boolean onlyDigits(String str){
        if(str == null || "".equals(str)){
            return false ;
        }
        for(int i = 0 ; i < str.length() ; i++){
            if(!Character.isDigit(str.charAt(i))){
                return false; 
            }
        }
        return true ;
    }
    public static void main(String[] args) {
        try{
            File obj = new File("DATA.in") ;
            Scanner scanner = new Scanner(obj) ; 
            List<String> res = new ArrayList<>() ; 
            while(scanner.hasNextLine()){
                String inp = scanner.nextLine() ; 
                String[] arr = inp.split("\\s+") ;
                BigInteger lim = new BigInteger(Integer.toString(Integer.MAX_VALUE)) ;
                for(String i : arr){
                    if(onlyDigits(i)){
                        BigInteger a = new BigInteger(i) ;            
                        if(a.compareTo(lim) == 1){
                            res.add(i) ;
                        }
                    }
                    else{
                        res.add(i) ;
                    }
                }
            }
            Collections.sort(res);
            for(String i : res){
                System.out.print(i + " ");
            }
        }
        catch(FileNotFoundException e){
            
        }
        
    }
    
}
