package liet_ke_cap_dau_ngoac;

import java.util.* ; 

class Pair{
    private int f, e ;

    public Pair(int f, int e) {
        this.f = f;
        this.e = e;
    }

    public int getE() {
        return e;
    }

    @Override
    public String toString() {
        return + f + " " + e ;
    }
    
}
public class Liet_ke_cap_dau_ngoac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ; 
        String s = scanner.nextLine() ; 
        Stack<Character> s1 = new Stack<>() ;
        Stack<Integer> s2 = new Stack<>() ;
        List<Pair> ls = new ArrayList<>() ; 
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == ')' && s1.size() > 0 && s2.size() > 0 && s1.peek() == '('){
                s1.pop() ; 
                ls.add(new Pair(s2.pop(), i + 1)) ;
            }
            else{
                s1.add(s.charAt(i)) ;
                s2.add(i + 1) ;
            }
        }
        ls.sort(new Comparator<>(){
            @Override
            public int compare(Pair o1, Pair o2) {
                return o1.getE() - o2.getE() ;
            }
            
        });
        for(Pair x : ls){
            System.out.println(x);
        }
    }
    
}
