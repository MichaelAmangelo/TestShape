package Test;

public class Rectangle extends Shape {

    private double width;
    private double length;

    public Rectangle() {
        length  = 2;
        width =1;
    }

    public Rectangle(boolean isFilled, String color, double width, double length) {
        super(isFilled, color);
        this.width = width;
        this.length = length;
    }
    public void setLW(double x,double y){
        if (x>y){
           this.length = x;
        } else {
            this.width = y;
        }
    }
    public double getArea(){
        return this.width * this.length;
    }

    @Override
    public String toString() {
         return "Width: " + this.width + "\n" +
                 "Length: " + this.length + "\n" +
                 "Area: " + getArea() + "\n" +
                 super.toString();
    }
}
