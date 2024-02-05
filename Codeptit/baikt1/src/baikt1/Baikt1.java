/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baikt1;

import java.util.Scanner;

import java.util.Scanner ;
public class Baikt1 {
    
    public static Scanner scanner = new Scanner(System.in) ;

    public static void main(String[] args) {
        SoNguyen sn = null ;
        MaTran m = null ;
        while (true) {
           System.out.print("""
            1. nhap so nguyen
            2. Viet ra Tong
            3. Viet ra day so nguyen to
            4. nhap ma tran vuong
            5. viet ra tong hang
            6. viet ra ma tran chuyen vi                                  
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
                    sn=new SoNguyen();                   
                }
                case 2->{
                    sn.getTong();
                }
                case 3->{
                    sn.daySoNT();
                }
                case 4->{
                    System.out.print("kich thuoc ma tran:");
                    int n=sc.nextInt();
                    m=new MaTran(n);
                    System.out.println("-------------------");
                    m.out();
                }
                case 5->{
                    m.tongHang();
                }
                case 6->{
                    m.out();
                    MaTran cv=m.chuyenvi();
                    System.out.println("-----------------");
                    cv.out();
                }
                default-> System.out.println("cho lua chon 0->4");
            }
//       
        }
    
    }
}
