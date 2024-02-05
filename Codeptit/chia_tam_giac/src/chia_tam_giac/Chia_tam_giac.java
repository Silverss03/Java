/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chia_tam_giac;

import java.util.Scanner ;

public class Chia_tam_giac {

    public static Scanner scanner = new Scanner(System.in) ;
    public static void main(String[] args) {
        int tests = scanner.nextInt() ;
        while(tests -- > 0){
            int n = scanner.nextInt() ;
            int h = scanner.nextInt() ;
            for(double i = 1d ; i < n ; i++){
                System.out.printf("%.6f ", Math.sqrt(i/n)*h) ;
            }
            System.out.println();
        }
    }
    
}
