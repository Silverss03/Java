/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lich_giang_day_theo_giang_vien;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Subject{
    private String name, id ;
    private int num ;

    public Subject(String name, String id, int num) {
        this.name = name;
        this.id = id;
        this.num = num;
    }
    
    
}

class Schedule{
    private String id_s, date, seq, name, room, id_class ;
    private static int id_n = 1 ;

    public Schedule(String id_s, String date, String seq, String name, String room) {
        this.id_s = id_s;
        this.date = date;
        this.seq = seq;
        this.name = name;
        this.room = room;
        this.id_class = String.format("HP%3d", id_n++);
    }
    
    
}

public class Lich_giang_day_theo_giang_vien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File obj = new File("MONHOC.in") ;
        File obj2 = new File("LICHGD.in") ;
        List<Schedule> ls = new ArrayList<>();
        try{
            Scanner scanner = new Scanner(obj2) ;
            int n = Integer.parseInt(scanner.nextLine()) ;
            for(int i = 0 ; i < n ; i++){
                ls.add(new Schedule())
            }
         }
        catch(FileNotFoundException e){
            
        }
    }
    
}
