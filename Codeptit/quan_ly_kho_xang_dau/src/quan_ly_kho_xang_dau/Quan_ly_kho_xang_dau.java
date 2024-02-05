package quan_ly_kho_xang_dau;

import java.text.DecimalFormat;
import java.util.* ; 

class Station{
    private String id, brand ; 
    private double price, tax, total ; 

    public Station(String id, int amount) {
        this.id = id;
        double t = 0 ;
        switch (this.id.charAt(0)) {
            case 'X':
                this.price = 128000 ;
                this.tax = amount * price * 0.03 ;
                break;
            case 'D':
                this.price = 11200 ;
                this.tax = amount * price * 0.035 ;
                break;
            case 'N':
                this.price = 9700 ; 
                this.tax = amount * price * 0.02 ;
                break;
            default:
                break;
        }
        switch (id.substring(3)) {
            case "BP":
                this.brand = "British Petro" ;
                break;
            case "ES":
                this.brand = "Esso" ;
                break;
            case "SH":
                this.brand = "Shell" ;
                break;
            case "CA":
                this.brand = "Castrol" ;
                break;
            case "MO":
                this.brand = "Mobil" ;
                break;
            default:
                this.brand = "Trong Nuoc" ;
                this.tax = 0 ;
                break;
        }
        this.total = amount* price + this.tax ; 
    }

    public double getTotal() {
        return total;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.#") ;
        return id + " " + brand + " " + df.format(price) + " " + df.format(tax) + " " + df.format(total) ;
    }
    
    
}
public class Quan_ly_kho_xang_dau {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ; 
        int n = Integer.parseInt(scanner.nextLine()) ;
        List<Station> ls = new ArrayList<>() ; 
        for(int i = 0 ; i < n ; i++){
            ls.add(new Station(scanner.next(), scanner.nextInt())) ;
        }
        ls.sort(new Comparator<Station>(){
            @Override
            public int compare(Station o1, Station o2) {
                return Double.compare(o2.getTotal(), o1.getTotal() ) ;
            }
        }); 
        for(Station x : ls){
            System.out.println(x);
        }
    }
    
}

//3
//N89BP 4500
//D00BP 3500
//X92SH 2600