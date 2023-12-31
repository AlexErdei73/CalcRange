/* Program to calculate the range of a
projectile, neglecting air resistance */

public class RangeCalc {
    private static double inputParam(String[] args, int index, double defValue) {
        double value = defValue;
        try {
            value = Double.parseDouble(args[index]);
        } catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
            System.out.println("Invalid parameter, I use default value: " + defValue);
        }
        return  value;
    }
    public static void main(String[] args) {
        double speed = inputParam(args, 0, 20);
        new Range(speed);
    }
}