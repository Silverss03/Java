package xu_ly_van_ban;

import java.util.* ; 

public class Xu_ly_van_ban {

    public static String chuanhoa(String x){
        String[] arr = x.trim().split("\\s+") ;
        String tmp = "" ;
        tmp += arr[0].substring(0, 1).toUpperCase() + arr[0].substring(1).toLowerCase() + " " ;
        for(int i = 1 ; i < arr.length ; i++){
            tmp += arr[i].toLowerCase() + " " ;
        }
        return tmp ;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        String tmp = ""; 
        while(scanner.hasNext()){            
            String a = scanner.nextLine() ;
            tmp += a ;
        }
        System.out.println(tmp);
        String[] words = tmp.split("[.?!]+") ;
        for(String x : words){
            System.out.println(chuanhoa(x));
        }
    }
    
}
//ky thi LAP TRINH ICPC PTIT  bat dau to chuc     tu     nam 2010. nhu vay, nam nay la          tron 10 nam!
//    vay CO PHAI NAM NAY LA KY THI LAN THU 10?        khong phai! nam nay la KY THI LAN THU 11.