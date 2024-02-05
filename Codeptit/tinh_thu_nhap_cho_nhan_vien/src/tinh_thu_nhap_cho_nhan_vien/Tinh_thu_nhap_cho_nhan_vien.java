/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tinh_thu_nhap_cho_nhan_vien;

import java.text.DecimalFormat;
import java.util.* ; 
class Operator{
    private String id,name, pos ; 
    private double main_sal, bonus, tmp, remains ; 
    private static int id_n = 1 ; 

    public Operator(String name, String pos, double bas_sal, double days) {
        this.id = "NV" + String.format("%02d", id_n++) ; 
        this.name = name;
        this.pos = pos;
        if(pos.equals("GD")){
            this.bonus = 500 ;
        }
        else if(pos.equals("PGD")){
            this.bonus = 400 ;
        }
        else if(pos.equals("TP")){
            this.bonus = 300 ;
        }
        else if(pos.equals("KT")){
            this.bonus = 250 ;
        }
        else{
            this.bonus = 100 ;
        }
        this.main_sal = bas_sal * days  ;
        this.tmp = Math.round(((this.bonus + this.main_sal)*2/3) / 1000)*1000;
        if(tmp >= 25000){
            this.tmp = 25000 ;
        }
        this.remains = this.main_sal - this.tmp + this.bonus ; 
    }

    public double getMain_sal() {
        return main_sal;
    }

    public String getPos() {
        return pos;
    }

    public double getTmp() {
        return tmp;
    }

    public double getRemains() {
        return remains;
    }

    
    @Override
    public String toString() {
        return id + " " + name + " " + new DecimalFormat("#.#").format(bonus) + " " + new DecimalFormat("#.#").format(main_sal)  + " " + new DecimalFormat("#.#").format(tmp) + " " + new DecimalFormat("#.#").format(remains) ;
    }
    
    
}
public class Tinh_thu_nhap_cho_nhan_vien {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ; 
        int n = Integer.parseInt(scanner.nextLine()) ;
        List<Operator> ls =  new ArrayList<>() ; 
        for(int i = 0 ; i < n ; i++){
            ls.add(new Operator(scanner.nextLine(), scanner.nextLine(), 
                    Double.parseDouble(scanner.nextLine()), Double.parseDouble(scanner.nextLine())));
        }
        ls.sort(new Comparator<Operator>(){
            @Override
            public int compare(Operator o1, Operator o2) {
                return Double.compare(o2.getRemains() + o2.getTmp(), o1.getRemains() + o1.getTmp()) ;
            }
        });
        for(Operator x : ls){
            System.out.println(x);
        }
    }
    
}

//4
//Tran Thi Yen
//NV
//1000
//24
//Nguyen Van Thanh
//BV
//1000
//30
//Doan Truong An
//TP
//3000
//25
//Le Thanh
//GD
//5000
//28