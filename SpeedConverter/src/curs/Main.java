package curs;

public class Main {
    public static void main(String[] args) {
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
    }
    private static long toMilesPerHour(double kilometersPerHour) {
        if(kilometersPerHour < 0) {
            return -1;
        } else {
            double conversion = kilometersPerHour / 1.609;
            return Math.round(conversion);
        }

    }
    private static void printConversion(double kilometersPerHour){
        if(kilometersPerHour < 0) {
            System.out.println("Invalid value");
        }else {
           long conversion = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h= " + conversion + " mi/h" );
        }
    }
}
