/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kiem_tra_1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Kiem_tra_1 {

    public static void main(String[] args) {
        Xau s = null ; 
        DaySo a = null ;
        DaThuc x = null ;
        while(true){
        System.out.println("""
                           1. Nhap vao mot xau
                           2. Chuan hoa ho ten
                           3. In ra ten
                           4. Nhap vao 1 day so nguyen
                           5. Dua ra so lon nhat, nho nhat
                           6. Dua ra loai day so
                           7. Dua ra so lan xuat hien moi phan tu
                           8. Nhap vao mot da thuc
                           9. Tinh dao ham
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
                s = new Xau() ;
            }
            case 2->{
                if(s !=null)
                    s.chuanHoa();
            }
            case 3->{
                if(s != null)
                    s.out();
            }
            case 4->{
                a = new DaySo() ;
            }
            case 5->{
                if(a != null)
                    a.minMax();
            }
            case 6->{
                if(a != null)
                    a.kieuDay(); 
            }
            case 7->{

            }
            case 8->{
                x = new DaThuc() ; 
            }
            case 9->{
                
            }
            default-> System.out.println("cho lua chon 0->9");
            }
        }
  
    }
    
}
