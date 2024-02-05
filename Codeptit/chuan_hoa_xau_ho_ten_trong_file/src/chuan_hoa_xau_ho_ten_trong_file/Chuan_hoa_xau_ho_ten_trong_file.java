package chuan_hoa_xau_ho_ten_trong_file;

import java.io.* ; 
import java.util.* ; 
public class Chuan_hoa_xau_ho_ten_trong_file {

    public static void main(String[] args) {
        try{
            File obj = new File("DATA.in") ;
            Scanner scanner = new Scanner(obj) ; 
            while(true){
                String inp = scanner.nextLine().trim() ; 
                if(inp.equals("END")){
                    break ;
                }
                String[] arr = inp.split("\\s+") ;
                String res = "" ; 
                for(String i : arr){
                    res += i.substring(0, 1).toUpperCase() + i.substring(1).toLowerCase() + " " ;
                }
                System.out.println(res);
            }
        }
        catch(FileNotFoundException e){
            
        }
    }
    
}
