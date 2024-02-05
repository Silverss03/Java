package kt2q6;

public class GiaoDich {
    protected String id, date ;
    protected double price;
    protected int amount ;
    protected static int id_n = 1;

    public GiaoDich(String date, double price, int amount) {
        this.date = date;
        this.price = price;
        this.amount = amount;
    }

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    @Override
    public String toString(){
        return id + "\t" + date + "\t" + price + "\t" + amount ;
    }
}
