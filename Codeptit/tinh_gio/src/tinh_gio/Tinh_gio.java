/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tinh_gio;
import java.util.* ; 

class Cyber{
    private String id, name; 
    private int h, m, time ; 

    public Cyber(String id, String name, String in, String out) {
        this.id = id;
        this.name = name;
        this.time = (Integer.parseInt(out.substring(0, 2)) * 60 + Integer.parseInt(out.substring( 3))) - (Integer.parseInt(in.substring(0, 2)) * 60 + Integer.parseInt(in.substring( 3)));
        this.h = time / 60;
        this.m = time % 60;
    }

    public int getTime() {
        return time;
    }
    
    public String toString(){
        return id + " " + name + " " + h + " gio " + m + " phut" ;
    }
}
public class Tinh_gio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ; 
        int n = Integer.parseInt(scanner.nextLine()) ;
        List<Cyber> ls = new ArrayList<>() ; 
        for(int i = 0 ; i < n ; i++){
            ls.add(new Cyber(scanner.nextLine(), scanner.nextLine(),scanner.nextLine(),scanner.nextLine())) ;
        }
        ls.sort(new Comparator<Cyber>(){
            @Override
            public int compare(Cyber o1, Cyber o2) {
                return o2.getTime() - o1.getTime() ;
            }
            
        });
        for(Cyber x : ls){
            System.out.println(x);
        }
    }
    
}

//3
//01T
//Nguyen Van An
//09:00
//10:30
//06T
//Hoang Van Nam
//15:30
//18:00
//02I
//Tran Hoa Binh
//09:05
//10:00