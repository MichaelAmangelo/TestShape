package Test;

public class Shape {

    private boolean isFilled;
    private String color;

    public Shape() {
        isFilled = true;
        color = "Green";
    }

    public Shape(boolean isFilled, String color) {
        this.isFilled = isFilled;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Filled: " + this.isFilled + "\n" + "Color: "+ this.color;
    }


}
