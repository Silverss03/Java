package so_thuan_nghich_trong_file;

import java.io.* ; 
import java.util.* ; 
public class So_thuan_nghich_trong_file {

    public static boolean check(Integer x){
        int rev = 0, cnt = 0, tmp = x  ; 
        while(x > 0){
            int num = x % 10 ;
            if(num % 2 == 0){
                return false ;
            }
            rev = rev * 10 + num;
            x = (int)(x/10) ;
            cnt++ ; 
        }
        if(tmp != rev){
            return false ;
        }
        if(cnt == 1 || cnt % 2 == 0){
            return false ;
        }
        return true ;
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA1.in")) ;
        List<Integer> arr = (ArrayList<Integer>) ois.readObject() ; 
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in")) ;
        List<Integer> arr2 = (ArrayList<Integer>) ois2.readObject() ; 
        Set<Integer> ts = new HashSet<>(arr) ; 
        Set<Integer> ts2 = new HashSet<>(arr2) ;
        int[] cnt = new int[1000000] ; 
        int check = 0 ; 
        for(Integer x : arr){
            if(check(x) && ts2.contains(x)){
                cnt[x]++ ;
            }
        }
        for(Integer x : arr2){
            if(check(x) && ts.contains(x)){
                cnt[x]++ ;
            }
        }
        for(int i = 11 ; i < 1000000 ; i++){
            if(check == 10){
                break ;
            }
            if(cnt[i] > 0){
                check++ ; 
                System.out.println(i + " " + cnt[i]);
            }
        }
    }
    
}
