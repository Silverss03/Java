package hinh_chu_nhat_class;

import java.util.Scanner ;

class Rectangle{
    private double width, height ;
    private String color ; 

    public Rectangle() {
    }

    public Rectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public String getColor() {
        if(color.length() == 1){
            return color.toUpperCase() ;
        }
        return color.substring(0, 1).toUpperCase() + color.substring(1).toLowerCase() ;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double findArea(){
        return width*height ;
    }

    public double findPerimeter(){
        return 2*(width + height) ;
    }
}

public class Hinh_chu_nhat_class {

    public static Scanner scanner = new Scanner(System.in) ;
    public static void main(String[] args) {
        double a = scanner.nextDouble() ;
        double b = scanner.nextDouble() ;
        String col = scanner.next() ;
        if(a > 0 && b > 0){
            Rectangle r = new Rectangle(a,b,col) ;
            System.out.printf("%.0f %.0f %s", r.findPerimeter(), r.findArea(), r.getColor()) ;
        }
        else{
            System.out.println("INVALID");
        }
    }
    
}
