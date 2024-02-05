
package xau_khac_nhau_dai_nhat;

import java.util.Scanner ;
public class Xau_khac_nhau_dai_nhat {

    public static Scanner scanner = new Scanner(System.in) ;
    public static void main(String[] args) {
        int tests = Integer.parseInt(scanner.nextLine()) ;
        while(tests-- > 0){
            String a = scanner.nextLine() ; 
            String b = scanner.nextLine() ;
            if(a.equals(b)){
                System.out.println("-1");
            }
            else{
                System.out.println(Math.max(a.length(), b.length()));
            }
        }
    }
    
}
