/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package run;

import controller.NganHang;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Menu {
    public static void main(String[] args) {
        NganHang nn=new NganHang();
        while (true) {
            System.out.print("""
                1. nhap GD vang
                2. Nhap GD TT
                3. Viet ra cac giao dich cua ngan hang
                4.  xoa 1 giao dich            
                0. Thoat             
                             """);
            System.out.print("Ban chon (0->4): ");
            int chon;
            Scanner sc = new Scanner(System.in);
            chon = Integer.parseInt(sc.nextLine());
            System.out.println("----------------");
            switch (chon) {
                case 0 -> {
                    System.out.println("bye!!!");
                    System.exit(0);
                }
                case 1 -> {
                   nn.nhapGDVang(sc);
                }
                case 2 -> {
                    //nn.nhapGDTT(sc);
                }
                case 3 -> {
                    nn.out();
                }
                case 4 ->
                    System.out.print("");
                case 5 ->
                    System.out.print("");
                default ->
                    System.out.println("chi chon 0->4");
            }
        }
    }
}

