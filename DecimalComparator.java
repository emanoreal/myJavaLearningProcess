public class DecimalComparator {

    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        areEqualByThreeDecimalPlaces(3.175, 3.176);
        areEqualByThreeDecimalPlaces(3.0, 3.0);
        areEqualByThreeDecimalPlaces(-3.123, 3.123);
    }

    public static boolean areEqualByThreeDecimalPlaces(double firstValue, double secondValue) {

        long firstRounded = (long)(firstValue * 1000);
        long secondRounded = (long)(secondValue * 1000);

        if (firstRounded == secondRounded) {
            System.out.println("The values: " + firstValue + " and " + secondValue + " are equal in three decimal places!");
            return true;
        } else {
            System.out.println("The values: " + firstValue + " and " + secondValue + " are not equal in three decimal places!");
            return false;
        }

    }
}
