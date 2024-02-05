package ket_qua_xet_tuyen;

import java.text.DecimalFormat;
import java.util.* ;

class Attendant{
    private String id, name, status ; 
    private int age ;
    private double score ; 
    private static int id_n = 1; 
    
    public Attendant(String name, String b_day, double theory, double practice) {
        this.id = "PH" + String.format("%02d", id_n++) ; 
        this.name = name;
        this.age = 2021 - Integer.parseInt(b_day.substring(6)) ;
        double bonus = 0 ;
        if(theory >= 8 && practice >= 8){
            bonus = 1 ;
        }
        else if(theory >= 7.5 && practice >= 7.5){
            bonus = 0.5 ; 
        }
        this.score = Math.round((theory + practice)/2 + bonus) ; 
        if(this.score > 10){
            this.score = 10 ;
        }
        if(this.score == 9 || this.score == 10){
            this.status = "Xuat sac" ; 
        }
        else if(this.score == 8){
            this.status = "Gioi" ;
        }
        else if(this.score == 7){
            this.status = "Kha" ; 
        }
        else if(this.score >= 5 && this.score <= 6){
            this.status = "Trung binh" ; 
        }
        else if(this.score < 5){
            this.status = "Truot" ;
        }
    }

    public double getScore() {
        return score;
    }

    
    @Override
    public String toString() {
        return id + " " + name + " " + age+ " " + new DecimalFormat("#.#").format(score) + " " + status  ;
    }
    
    
}
public class Ket_qua_xet_tuyen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ; 
        int n = Integer.parseInt(scanner.nextLine()) ;
        List<Attendant> ls = new ArrayList<>() ;
        for(int i = 0 ; i < n ; i++){
            ls.add(new Attendant(scanner.nextLine(), scanner.nextLine(), Double.parseDouble(scanner.nextLine()), Double.parseDouble(scanner.nextLine()))) ;
        }
        ls.sort(new Comparator<Attendant>(){
            @Override
            public int compare(Attendant o1, Attendant o2) {
                return Double.compare(o2.getScore(), o1.getScore()) ;
            }
            
        });
        for(Attendant x : ls){
            System.out.println(x);
        }
    }
    
}

//3
//Doan Thi Kim
//13/03/1982
//8
//9.5
//Dinh Thi Ngoc Ha
//03/09/1996
//6.5
//8
//Tran Thanh Mai
//12/09/2004
//8
//9