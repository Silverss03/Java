package danh_sach_mat_hang;

import java.util.* ; 

class Item implements Comparable<Item>{
    public static int ID_N = 1 ;
    private String id, name, unit ; 
    private int buy, sell, inc ;

    public Item() {
    }
        
    public Item(String name, String unit, int buy, int sell){
        Scanner scanner = new Scanner(System.in) ;
        id = "MH" + String.format("%03d", ID_N++) ;
        this.name = name ; 
        this.unit = unit ; 
        this.buy = buy ; 
        this.sell = sell ;
        inc = sell - buy ; 
    }

    public int getInc(){
        return inc ;
    }
    
    @Override
    public int compareTo(Item o){        
        return o.getInc() - inc;
    }
    
    @Override
    public String toString(){
        return id + " " + name + " " + unit + " " + buy + " " + sell + " " + inc ;
    }
}
public class Danh_sach_mat_hang {

    public static Scanner scanner = new Scanner(System.in) ;
    public static void main(String[] args) {
        int n = Integer.parseInt(scanner.nextLine()) ;
        List<Item> arr = new ArrayList<>(n) ;
        for(int i = 0 ; i < n ; i++){
            String name = scanner.nextLine() ; 
            String unit = scanner.nextLine() ;
            int buy = Integer.parseInt(scanner.nextLine()) ;
            int sell = Integer.parseInt(scanner.nextLine()) ;
            Item tmp = new Item(name, unit, buy, sell) ;
            arr.add(tmp) ;
        }
        Collections.sort(arr);
        for(Item x : arr){
            System.out.println(x);
        }
    }
    
}
