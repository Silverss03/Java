package hello_file;

import java.io.File ;
import java.io.FileNotFoundException ;
import java.util.* ;
public class Hello_File {

    
    public static void main(String[] args) {
        try{
            File obj = new File("Hello.txt") ;
            Scanner scanner = new Scanner(obj) ;
            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }
        catch(FileNotFoundException e){
            
        }
    }
    
}
