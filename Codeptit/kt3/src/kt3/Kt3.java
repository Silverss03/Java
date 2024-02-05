package kt3;

import java.util.Scanner;


public class Kt3 {

    public static void main(String[] args) {
        SoNguyen n = null ; 
        Xau s = null ;
        MaTran m = null ;
        while(true){
        System.out.println("""
                           1. Nhap vao so nguyen duong n
                           2. Viet cac so chia het cho 7
                           3. Dua ra n!
                           4. Nhap vao 1 xau
                           5. Dua ra email
                           6. Tach cac tu trong doan
                           7. Nhap vao 1 ma tran vuong 
                           8. Tinh tong hang cot hoac cheo chinh co tong max
                            """);
                    System.out.print("moi chon(0->9): ");
        int chon;
        Scanner sc = new Scanner(System.in);
        chon = sc.nextInt();
        switch (chon) {
            case 0->{
                System.out.println("Bye!!");
                System.exit(0);
            }
            case 1->{ 
                n = new SoNguyen() ;
            }
            case 2->{
                if(n != null)
                    n.chiaHet() ;
            }
            case 3->{
                if(n != null)
                    n.giaiThua();
            }
            case 4->{
                s = new Xau() ;
            }
            case 5->{
                if(s != null)
                    s.email(); 
            }
            case 6->{
                if(s != null)
                    s.tach();
            }
            case 7->{
               m = new MaTran() ;
            }
            case 8->{
                if(m != null)
                    m.max();
            }
            default-> System.out.println("cho lua chon 0->9");
            }
        }
    }
}
