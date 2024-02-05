package word_set;

import java.io.*;
import java.util.*;
class WordSet{
    private List<String> s ; 

    public WordSet() {
    }

    public WordSet(String s) {
        this.s = new ArrayList<>() ;
        String[] arr = s.toLowerCase().split("\\s+") ;
        for(String x : arr){
            this.s.add(x) ;
        }
    }

    public List<String> getS() {
        return s;
    }

    public void setS(List<String> s) {
        this.s = s;
    }

    
    public WordSet union(WordSet s2){
        Set<String> st = new TreeSet<>() ; 
        for(String x : s){
            st.add(x) ;
        }
        for(String x : s2.getS()){
            st.add(x) ;
        }
        String res = "" ;
        for(String x : st){
            res += x + " " ;
        }
        return new WordSet(res) ;
    }
    
    public WordSet intersection(WordSet s2){
        WordSet union = this.union(s2);
        String res = "";
        for(String str: union.getS()){
            if(this.s.contains(str) && s2.getS().contains(str)) res += str + " ";
            
        }
        return new WordSet(res);     
    }

    @Override
    public String toString() {
        String res = "" ;
        for(String x : s){
            res += x + " " ;
        }
        return  res ;
    }
    
    
}

public class Word_set {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
    
}

//Lap trinh huong doi tuong
//Ngon ngu lap trinh C++