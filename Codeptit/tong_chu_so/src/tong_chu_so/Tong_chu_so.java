package tong_chu_so;

import java.io.* ;
import java.math.BigInteger;
import java.util.* ;

public class Tong_chu_so {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("DATA.in") ;
        ObjectInputStream ois = new ObjectInputStream(fis) ;
        List<String> ls = (List<String>)ois.readObject() ;
        List<BigInteger> nums = new ArrayList<>() ; 
//        File f = new File("DATA.in") ; 
//        Scanner scanner = new Scanner(f);
//        List<String>ls = new ArrayList<>() ; 
//        while(scanner.hasNext()){
//           ls.add(scanner.next()) ;
//        }
        for(int i = 0 ; i< ls.size() ; i++){
            String s = ls.get(i) ;
            String n = "" ;
            for(int j = 0 ; j < s.length() ; j++){
                if(Character.isDigit(s.charAt(j))){
                    n += s.charAt(j) ;
                }
            }
            nums.add(new BigInteger(n)) ;
        }
        for(BigInteger x : nums){
            int sum = 0 ; 
            String s = x.toString() ;
            for(int i = 0 ; i < s.length() ; i++){
                sum += (int)(s.charAt(i) - '0') ;
            }
            System.out.println(x + " " + sum);
        }
    }
    
}
