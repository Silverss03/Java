/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onclass;

import java.util.List;

/**
 *
 * @author Admin
 */
public class PrintGeneric {
    public <E> void printArray(E[] inputArray){
        for(E element : inputArray){
            System.out.printf("%s ", element);
        }
            System.out.println("");
    }

}
