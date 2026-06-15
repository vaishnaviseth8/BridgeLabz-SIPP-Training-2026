public class UnitConvertor2 {

    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }

    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }

    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }

    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }

    public static double convertInchesToCm(double inches) {
        return inches * 2.54;
    }

    public static void main(String[] args) {

        System.out.println("5 Yards = " +
                convertYardsToFeet(5) + " Feet");

        System.out.println("15 Feet = " +
                convertFeetToYards(15) + " Yards");

        System.out.println("2 Meters = " +
                convertMetersToInches(2) + " Inches");

        System.out.println("20 Inches = " +
                convertInchesToMeters(20) + " Meters");

        System.out.println("10 Inches = " +
                convertInchesToCm(10) + " CM");
    }
}