package kt1;

import java.util.Scanner ;
public class Kt1 {

    
    public static void main(String[] args) {
        SoNguyen n = null ;
        Xau s = null ;
        MaTran x = null ; 
        while(true){
            System.out.println("""
                               1. Nhap vao so nguyen duong n
                               2. Viet ra tong s=1+2+3+....+n
                               3. Dua ra day so nguyen to nho hon va bang n
                               4. Nhap vao 1 xau
                               5. Dua ra do dai cua xau
                               6. Dua ra so cau cua xau
                               7. Nhap vao 1 ma tran vuong A
                               8. Dua ra tong cac hang cua ma tran
                               9. Tinh dinh thuc cua ma tran A""");
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
                    if(n!= null) n.tong();
                }
                case 3->{
                    if(n != null){
                        n.snt();
                    }
                }
                case 4->{
                    s = new Xau() ;
                }
                case 5->{
                    if(s != null) s.dai();
                }
                case 6->{
                    if(s != null) s.soCau();
                }
                case 7->{
                    x = new MaTran() ; 
                }
                case 8->{
                    if(x != null){
                        x.tongHang();
                    }
                }
                case 9->{
                    
                }
                default-> System.out.println("cho lua chon 0->9");

            }
        }
    }

    
}
