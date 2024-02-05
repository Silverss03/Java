package tinh_tong;

import java.io.File ;
import java.io.FileNotFoundException ;
import java.util.Scanner ; 
public class Tinh_tong {

    public static void main(String[] args) {
        try{
            File obj = new File("DATA.in") ;
            long sum = 0 ;
            Scanner scanner = new Scanner(obj) ;
            while(scanner.hasNext()){
                String a = scanner.next() ; 
                try{
                    sum += Integer.parseInt(a) ;
                }
                catch(Exception e){
                    
                }
            }
            System.out.println(sum);
        }
        catch(FileNotFoundException e){
            
        }
        
    }
    
}
