/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package run;

import java.util.Scanner;
import kt2q6.NganHang;


public class Cau42 {
    public static void main(String[] args) {
        NganHang n=new NganHang();
        //n.out();
        Scanner in=new Scanner(System.in);
        double tu=Double.parseDouble(in.nextLine());
        double den=Double.parseDouble(in.nextLine());
        n.timGDVangTuGiaDenGia(tu, den);
    }

}
