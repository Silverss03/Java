/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bt;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Bt {

    public static Scanner scanner = new Scanner(System.in) ;
    public static void main(String[] args) {
        SinhVien  s=new SinhVien();
        while (true) {
            System.out.print("""
            1. Nhập sinh vien
            2. Viết ra sinh vien
            3. dat lai diem 1
            4. lay ra GPA
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
                    s.input() ;
                }
                case 2->{
                    System.out.println(s);
                }
                case 3->{
                    double tmp = Double.parseDouble(scanner.nextLine()) ;
                    s.setDiem1(tmp);
                    s.setGpa();
                }
                case 4->{
                    System.out.println(s.getGpa());
                }
                default-> System.out.println("cho lua chon 0->4");
            }
        }
    }
    
}
