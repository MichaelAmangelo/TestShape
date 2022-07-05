package Test;

public class Circle extends Shape {

    private double radius;

    public Circle() {
        radius =1;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(boolean isFilled, String color, double radius) {
        super(isFilled, color);
        this.radius = radius;
    }
    public double getArea(){

        return  Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public String toString() {
        super.toString();
        return  "Radius: " + this.radius + "\n" +
                "Area: " + getArea() + "\n" +
                super.toString();
    }

}

