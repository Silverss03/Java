package lop_2_ma_tran;

import java.util.Scanner ;
public class Lop_2_ma_tran {

    public static Scanner scanner = new Scanner(System.in) ;
    public static void main(String[] args) {
        MaTran a = null ;
        MaTran b = null ;
        while (true) {
            System.out.print("""
            1. Nhap 2 ma tran
            2. Viet ra tong 2 ma tran
            3. Viet ra hieu 2 ma tran
            0. Thoat                      
                            """);
            System.out.print("moi chon(0->3): ");
            int chon;
            Scanner sc = new Scanner(System.in);
            chon = sc.nextInt();
            switch (chon) {
                case 0->{
                    System.out.println("Bye!!");
                    System.exit(0);
                }
                case 1->{
                    System.out.println("Nhap kich co 2 ma tran:");
                    int n = scanner.nextInt() ;
                    a = new MaTran(n) ;
                    b = new MaTran(n) ;
                    System.out.println("Nhap ma tran dau tien: " );  
                    a.inp(n) ;
                    System.out.println("Nhap ma tran thu hai:");
                    b.inp(n) ;
                }
                case 2->{
                    if(a != null && b != null){
                        MaTran c = a.sum(b) ;
                        c.out(a.getSize()) ;
                    }
                }
                case 3->{
                    if(a != null && b != null){
                        MaTran c = a.neg(b) ;
                        c.out(a.getSize()) ;
                    }                    
                }
                default-> System.out.println("cho lua chon 0->3");
            }
        }
    }
    
}
