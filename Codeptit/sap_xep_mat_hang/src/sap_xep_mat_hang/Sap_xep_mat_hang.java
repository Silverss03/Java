package sap_xep_mat_hang;

import java.io.* ;
import java.util.* ; 

class Merchandise implements Comparable<Merchandise>{
    private String name, id, group ;
    private static int id_n = 1 ;
    private Double profit ;

    public Merchandise(String name, String group, double buy, double sell) {
        this.name = name;
        this.id = "MH" + String.format("%02d", id_n++);
        this.group = group;
        this.profit = sell - buy ;
    }

    public double getProfit() {
        return profit;
    }
    
    
    @Override
    public String toString(){
        return id + " " + name + " " + group + " " + String.format("%.2f", profit) ;
    }

    @Override
    public int compareTo(Merchandise o) {
        return -profit.compareTo(o.getProfit() ) ;
    }
    
}
public class Sap_xep_mat_hang {


    public static void main(String[] args) throws FileNotFoundException{
        File obj = new File("MATHANG.in") ;
        Scanner scanner = new Scanner(obj) ;
        int amount = Integer.parseInt(scanner.nextLine()) ; 
        List<Merchandise> ls = new ArrayList<>() ;
        for(int i = 0 ; i < amount ; i++){
            String name = scanner.nextLine() ; 
            String group = scanner.nextLine() ; 
            double buy = Double.parseDouble(scanner.nextLine()) ;
            double sell = Double.parseDouble(scanner.nextLine()) ;
            Merchandise tmp = new Merchandise(name, group, buy, sell) ;
            ls.add(tmp) ;
        }
        Collections.sort(ls);
        for(Merchandise x : ls){
            System.out.println(x);
        }
        scanner.close(); 
    }
    
}
