
package lopdaysothuc;

import java.util.Scanner ;
public class Lopdaysothuc {

    public static Scanner scanner = new Scanner(System.in) ;
    public static void main(String[] args) {
        dayso a = null ;
        while (true) {
            System.out.print("""
            1. Nhap day n
            2. Viet ra tong day
            3. Viet ra min max cua day
            4. Vi tri dau tien cua phan tu lon nhat
            0. Thoat                      
                            """);
            System.out.print("moi chon(0->4): ");
            int chon;
            Scanner sc = new Scanner(System.in);
            chon = sc.nextInt();
            switch (chon) {
                case 0->{
                    System.out.println("Bye!!");
                    System.exit(0);
                }
                case 1->{
                    a = new dayso() ;
                    a.input() ;
                }
                case 2->{
                    if(a != null){
                        a.tong();
                    }       
                }
                case 3->{
                    if(a!= null){
                        a.minmax() ;
                    }
                }
                case 4->{
                    if(a != null){
                        a.pos_min_max() ;
                    }        
                }
                default-> System.out.println("cho lua chon 0->4");
            }
        }
    }
    
}
