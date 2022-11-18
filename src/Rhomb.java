public class Rhomb extends Square{
    private double angleAlpha;
    private double angleBeta;

    public Rhomb() {
    }

    public Rhomb(double side, double angleAlpha, double angleBeta) {
        super(side);
        this.angleAlpha = angleAlpha;
        this.angleBeta = angleBeta;
    }

    public Rhomb(double side, double angleAlpha) {
        super(side);
        this.angleAlpha = angleAlpha;
        this.angleBeta = (360-(angleAlpha*2))/2;
    }

    public double getAngleAlpha() {
        return angleAlpha;
    }

    public double getAngleBeta() {
        return angleBeta;
    }

    public void setAngleAlpha(double angleAlpha, double angleBeta) {
        if(angleAlpha+angleBeta == 180) {
            this.angleAlpha = angleAlpha;
            this.angleBeta = angleBeta;
        }
    }
}
