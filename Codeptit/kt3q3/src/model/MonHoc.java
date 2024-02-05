package model;

import java.io.Serializable;

public class MonHoc implements Serializable{
    private int id,  credits;
    private String subject_name, subject_type  ;
    private static int id_n = 100 ;

    public MonHoc() {
    }

    public MonHoc(int credits, String subject_name, String subject_type) {
        this.id = id_n++ ;
        this.credits = credits;
        this.subject_name = subject_name;
        this.subject_type = subject_type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getSubject_name() {
        return subject_name;
    }

    public void setSubject_name(String subject_name) {
        this.subject_name = subject_name;
    }

    public String getSubject_type() {
        return subject_type;
    }

    public void setSubject_type(String subject_type) {
        this.subject_type = subject_type;
    }

    public static int getId_n() {
        return id_n;
    }

    public static void setId_n(int id_n) {
        MonHoc.id_n = id_n;
    }
    
    public Object[] toObject(){
        return new Object[]{
            id, subject_name, credits, subject_type
        } ;
    }
}
