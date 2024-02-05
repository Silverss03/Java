package model;

import java.io.Serializable;

public class BangDiem implements Serializable{
    private SinhVien sv ;
    private MonHoc mh ; 
    private int points ; 

    public BangDiem() {
    }

    public BangDiem(SinhVien sv, MonHoc mh, int points) {
        this.sv = sv;
        this.mh = mh;
        this.points = points;
    }

    public SinhVien getSv() {
        return sv;
    }

    public void setSv(SinhVien sv) {
        this.sv = sv;
    }

    public MonHoc getMh() {
        return mh;
    }

    public void setMh(MonHoc mh) {
        this.mh = mh;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
    
    public Object[] toObject(){
        return new Object[]{
            sv.getId(), sv.getName(), mh.getId(), mh.getSubject_name(), points 
        };
    }
}
