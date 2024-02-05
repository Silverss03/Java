package model;

public class GiaoDichVang extends GiaoDich implements IGiaoDich{
    private String loaiVang;

    public GiaoDichVang() {
    }

    public GiaoDichVang(String ngay, double gia, int soluong,String loaiVang) {
        super(ngay, gia, soluong);
        this.loaiVang = loaiVang;
    }

    public String getLoaiVang() {
        return loaiVang;
    }

    public void setLoaiVang(String loaiVang) {
        this.loaiVang = loaiVang;
    }
    @Override
    public void setMa(){
        super.setMa();
        super.setMa("V-"+super.getMa());
    }
    @Override
    public String getMa(){
        return super.getMa();
    }
    @Override
    public double getThanhTien() {
        return (super.getSoluong()*super.getGia());
    }
    @Override
    public String toString(){
        return getMa()+"\t"+getNgay()+"\t"+
                getGia()+"\t"+getSoluong()+"\t"+getLoaiVang()+"\t"+getThanhTien();
    }
}
