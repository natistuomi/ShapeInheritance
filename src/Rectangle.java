public class Rectangle extends TwoDShape{
    private double width = 1.0;
    private double height = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        this.setCircumference(calculateCircumference());
        this.setArea(calculateArea());
    }

    public double calculateCircumference(){
        return (2*width)+(2*height);
    }

    public double calculateArea(){
        return width*height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
