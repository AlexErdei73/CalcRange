import java.text.DecimalFormat;

public class Range {
    private double speed;
    private double angleInDegrees;
    private double range;
    Range(double speed) {
        /* double angle = 0;
        while (angle <= 90) {
            this.calc(speed, angle);
            this.showRange();
            angle += 5;
        } */
        for (double angle = 0; angle <= 90; angle += 5) {
            this.calc(speed, angle);
            this.showRange();
        }
    }
    public void calc(double speed, double angle) {
        this.speed = speed;
        this.angleInDegrees = angle;
        double g, angleInRads;   //declaring 2 variables
        g = 9.8;    //in SI units
        angleInRads = angle / 180 * Math.PI;
        this.range = 2 * speed * speed / g * Math.sin(angleInRads) * Math.cos(angleInRads);
    }

    public void showRange() {
        DecimalFormat twoDecPlaces = new DecimalFormat("0.00");
        System.out.print("Speed = " + this.speed + " m/s; ");
        System.out.print("Angle = " + this.angleInDegrees + " degrees; ");
        System.out.println("Range = " + twoDecPlaces.format(this.range) + " meters");
    }
}
