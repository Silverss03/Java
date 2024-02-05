package hoc_sinh_ptit;

import java.util.* ; 

class Pair{
    private String k ; 
    private int v ; 

    public Pair(String k, int v) {
        this.k = k;
        this.v = v;
    }

    public String getK() {
        return k;
    }

    public int getV() {
        return v;
    }

    @Override
    public String toString() {
        return k ;
    }
}

public class Hoc_sinh_PTIT {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ; 
        int n = Integer.parseInt(scanner.nextLine()) ; 
        Map<String, Integer> mp = new HashMap<>() ; 
        List<Pair> ls = new ArrayList<>() ; 
        for(int i = 0 ; i < n ; i++){
            scanner.nextLine() ; 
            scanner.nextLine() ;
            String province = scanner.nextLine() ; 
            if(mp.containsKey(province)){
                mp.put(province, mp.get(province) + 1) ;
            }
            else{
                mp.put(province, 1) ; 
            }
        }
        for(String x : mp.keySet()){
            ls.add(new Pair(x, mp.get(x))) ;
        }
        ls.sort(new Comparator<Pair>(){
            @Override
            public int compare(Pair o1, Pair o2) {
                if(o1.getV() == o2.getV()){
                    return o1.getK().compareTo(o2.getK()) ;
                }
                else{
                    return o2.getV() - o1.getV() ;
                 }
            }
            
        });
        for(Pair x : ls){
            System.out.println(x);
        }
    }
    
}
