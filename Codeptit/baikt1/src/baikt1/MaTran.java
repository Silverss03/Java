package baikt1;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class MaTran {
    private double[][] a;

    public MaTran() {
    }

    public MaTran(double[][] a) {
        this.a = a;
    }

    public MaTran(int num) {
        a=new double[num][num];
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap ma tran "+num+"x"+num);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j]=sc.nextDouble();
            }
        }
    }
    
    public void tongHang(){
        System.out.print("Tong hang:");
        for(int i=0;i<a.length;i++){
            int h=0;
            for(int k=0;k<a[0].length;k++){
                h+=a[i][k];
            }
            System.out.print(h+" ");
        }
        System.out.println();
    }
    public MaTran chuyenvi(){
        double[][] t=new double[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                t[i][j]=a[j][i];
            }
        }
        return new MaTran(t);
    }
    public void out(){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
