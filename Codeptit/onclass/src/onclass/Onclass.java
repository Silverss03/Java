package onclass;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.* ;


public class Onclass {
    public static void main(String[] args) {
        List<SinhVien> ls = IOFile.doc("sinhvien.dat") ;
        for(SinhVien x : ls){
            System.out.println(x);
        }
    }    
}
