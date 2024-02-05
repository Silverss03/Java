package kt2;

import java.util.*;

public class Kt2 {

    public static void main(String[] args) {
        Day a = null ;
        Xau s = null ;
        MaTran m1 = null ;
        MaTran m2 = null ;
        while(true){
            System.out.println("""
                               1. Nhap vao day so thuc
                               2. Tong
                               3. Sap xep
                               4. Nhap vao 1 doan
                               5. Dua ra do dai cua xau
                               6. Tach cac tu trong doan
                               7. Nhap vao 2 ma tran vuong 
                               8. Tinh tong
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
                    a = new Day() ; 
                }
                case 2->{
                    if(a != null){
                        a.tong(); 
                    }
                }
                case 3->{
                    if(a != null){
                        a.sapXep();
                    }
                }
                case 4->{
                    s = new Xau() ; 
                }
                case 5->{
                    if(s != null){
                        s.doDai();
                    }
                }
                case 6->{
                    if(s != null){
                        s.tachTu();
                    }
                }
                case 7->{
                    m1 = new MaTran() ;
                    m2 = new MaTran() ;                   
                }
                case 8->{
                    m1.tong(m2);
                }
                default-> System.out.println("cho lua chon 0->9");
            }
        }
    }
}
