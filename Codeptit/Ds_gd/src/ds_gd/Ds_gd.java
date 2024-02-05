/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ds_gd;

import java.util.Scanner;
import controller.QLNGanHang ;

public class Ds_gd {


    public static void main(String[] args) {
        QLNGanHang nn = null ;
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
                }
                case 2->{
                }
                case 3->{
                }
                case 4->{
                }
                case 5->{
                }
                case 6->{
                }
                case 7->{
                }
                case 8->{
                }
                case 9->{
                    
                }
                default-> System.out.println("cho lua chon 0->9");

            }
        }
    }
    
}
