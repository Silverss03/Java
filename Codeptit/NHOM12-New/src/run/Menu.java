package run;


//nhap tu ban phim
import controller.NganHang;
import java.util.Scanner;


public class Menu {
    
    public static void main(String[] args) {
        NganHang n=new NganHang();
        while(true){
            System.out.print("""
                1. nhap 1
                2. Nhap 2
                3. Viet ra
                4. Xoa                           
                0. Thoat             
                             """);
            System.out.print("Ban chon (0->4): ");
            int chon;
            Scanner sc=new Scanner(System.in);
            chon=sc.nextInt();
            System.out.println("----------------");
            switch(chon){
                case 0->{
                    System.out.println("bye!!!");
                    System.exit(0);
                }
                case 1->{
                    
                }
                case 2->{
                    
                }
                case 3->{
                    n.out();
                }
                case 4-> {
                    
                }
                
                default-> System.out.println("chi chon 0->4");
            }
            
        }
    }
}
