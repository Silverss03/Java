package tach_doi_va_tinh_tong;

import java.io.File ;
import java.util.Scanner ;
import java.io.FileNotFoundException ;
import java.math.BigInteger ;
public class Tach_doi_va_tinh_tong {

    public static void main(String[] args) {
        try{
            File obj = new File("DATA.in") ;
            Scanner scanner = new Scanner(obj) ; 
            BigInteger n = new BigInteger(scanner.next()) ;
            String s = n.toString() ;
            while(s.length() != 1){
                BigInteger a = new BigInteger(s.substring(0, s.length()/2)) ;
                BigInteger b = new BigInteger(s.substring(s.length()/2)) ;
                BigInteger c = a.add(b) ;
                System.out.println(c);
                s = c.toString()    ;
            }
        }
        catch(FileNotFoundException e){
            
        }
    }
    
}
