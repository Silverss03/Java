/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tinh_tien_choi_game;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Game implements Comparable<Game>{
    private String name_cus, name_com, id ;
    private Long  money, inc;
    private Double time  ;
    private static int id_n = 1 ;

    public Game(String name_cus, String name_com, Double time, Long money) {
        this.id = String.format("KH%02d", id_n++) ;
        this.name_com = name_com ;
        this.name_cus = "";
        String[] arr = name_cus.trim().toLowerCase().split("\\s+") ;
        for(String x : arr){
            this.name_cus += x.substring(0,1).toUpperCase() + x.substring(1).toLowerCase() + " ";
        }
        this.name_cus = this.name_cus.trim() ;
        this.time = time;
        Long h = Math.round(Math.ceil(this.time/60D)) ;
        this.money = money;
        if(this.name_com.contains("Hacom")){
            this.inc = 100000 * h ; 
        }
        else if(this.name_com.contains("Dell")){
            this.inc = 70000 * h ;
        }
        else{
            this.inc = 40000 * h ; 
        }
    }

    public Double getTime() {
        return time;
    }

    @Override
    public int compareTo(Game o) {
        return Double.compare(time, o.getTime()) ;
    }
    
    @Override
    public String toString(){
        Long h = Math.round(Math.ceil(this.time/60D)) ;
        return this.id + " " + this.name_cus + " " + this.name_com + " " + new DecimalFormat("#.#").format(h) + " " + new DecimalFormat("#.#").format(this.inc) ; 
    }
}
public class Tinh_tien_choi_game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File obj = new File("game.dat") ;
        List<Game> ls = new ArrayList<>();
        try{
            Scanner scanner = new Scanner(obj) ;
            int n = Integer.parseInt(scanner.nextLine()) ;
            for(int i = 0 ; i < n ; i++){
                String name_cus = scanner.nextLine().trim() ; 
                String name_com = scanner.nextLine().trim();
                String[] b_time = scanner.nextLine().split(":") ;
                String[] e_time = scanner.nextLine().split(":") ; 
                Double time = Double.parseDouble(e_time[0]) * 60 + Double.parseDouble(e_time[1]) - Double.parseDouble(b_time[0]) * 60 - Double.parseDouble(b_time[1]) ;
                Long money = Long.parseLong(scanner.nextLine()) ;
                ls.add(new Game(name_cus, name_com, time, money)) ;
            }
            Collections.sort(ls);
            for(Game x : ls){
                System.out.println(x);
            }
         }
        catch(FileNotFoundException e){
            
        }
    }
    
}
