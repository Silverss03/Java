package kt2q2;

public class XeMay extends PTGT{
    private String congsuat ;

    public XeMay( String hang, String nam, Double gia, String mau, String congSuat) {
        super(hang, nam, gia, mau);
        this.congsuat = congSuat ;
    }

    public String getCongsuat() {
        return congsuat;
    }

    public void setCongsuat(String congsuat) {
        this.congsuat = congsuat;
    }

    @Override
    public String getMa() {
        return ma;
    }

    public void setMa() {
        this.ma = String.format("XM-%03d", id_n++);
    }
    
    @Override
    public String toString(){
        return super.getMa() + " " + super.getHang() + " " + super.getNam() + " " + super.getMau() + " " + super.getGia() + " " + congsuat ;
    }
}
