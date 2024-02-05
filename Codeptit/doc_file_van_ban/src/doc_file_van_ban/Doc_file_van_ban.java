package doc_file_van_ban;

import java.io.File ;
import java.util.Scanner ;
import java.io.FileNotFoundException ;
public class Doc_file_van_ban {

    public static void main(String[] args) {
        try{
            File obj = new File("DATA.in") ;
            try (Scanner scanner = new Scanner(obj)) {
                while(scanner.hasNextLine()){
                    String data = scanner.nextLine() ;
                    System.out.println(data);
                }
            }
        }
        catch(FileNotFoundException e){
        }
    }
    
}
