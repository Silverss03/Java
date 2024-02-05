package model;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class SinhVien implements Serializable{
    private int id ;
    private String name, b_day, major ; 
    private static int id_n = 10000; 

    public SinhVien() {
    }

    public SinhVien(String name, String b_day, String major) {
        this.id = id_n++ ;
        this.name = name;
        this.b_day = b_day;
        this.major = major;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getB_day() {
        return b_day;
    }

    public void setB_day(String b_day) {
        this.b_day = b_day;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public static int getId_n() {
        return id_n;
    }

    public static void setId_n(int id_n) {
        SinhVien.id_n = id_n;
    }
    
    public Object[] toObject(){
        return new Object[]{
            id, name, b_day, major 
        };
    }
}
