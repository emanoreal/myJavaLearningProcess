public class TeenNumberChecker {

    public static void main(String[] args) {
        hasTeen(9, 99, 19);
        hasTeen(23, 15, 42);
        hasTeen(22, 23, 34);

        isTeen(9);
        isTeen(13);
    }
    public static boolean hasTeen(int firstValue, int secondValue, int thirdValue) {
        if (firstValue >= 13 && firstValue <= 19) {
            System.out.println(firstValue + " is in the interval 13-19");
            return true;
        } else if (secondValue >= 13 && secondValue <= 19) {
            System.out.println(secondValue + " is in the interval 13-19");
            return true;
        } else if (thirdValue >= 13 && thirdValue <= 19) {
            System.out.println(thirdValue + " is in the interval 13-19");
            return true;
        } else {
            System.out.println("None of the values are in the interval 13-19");
            return false;
        }
    }

    public static boolean isTeen(int firstValue) {
        if (firstValue >= 13 && firstValue <= 19) {
            System.out.println("The value " + firstValue + " is in the interval");
            return true;

        } else {
            System.out.println("The value " + firstValue + " is not in the interval");
            return false;
        }
    }
}
