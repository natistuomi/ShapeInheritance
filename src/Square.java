public class Square extends Rectangle{
    private int side;

    public Square(double side) {
        super(side, side);
    }

    public Square() {
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}
