package xep_hang;

import java.util.* ; 

class Pair implements Comparable<Pair>{
    private int begin, end ;

    public Pair(int begin, int end) {
        this.begin = begin;
        this.end = end;
    }

    public int getBegin() {
        return begin;
    }

    public int getEnd() {
        return end;
    }

    
    @Override
    public int compareTo(Pair o) {
        return Integer.compare(begin, o.getBegin()) ;
    }
    
    
}
public class Xep_hang {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int n = Integer.valueOf(scanner.nextLine()) ;
        int time = 0 ; 
        List<Pair> ls = new ArrayList<>() ;
        for(int i = 0 ; i < n ; i++){
            int begin = scanner.nextInt() ;
            int end = scanner.nextInt() ;
            scanner.nextLine() ; 
            ls.add(new Pair(begin, end)) ;
        }
        Collections.sort(ls);
        for(Pair x : ls){
            if(x.getBegin() > time){
                time = x.getBegin() ;
            }
            time += x.getEnd() ;
        }
        System.out.println(time);
    }
    
}
//3
//2 1
//8 3
//5 7