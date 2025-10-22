public class EqualSumChecker {

    public static void main(String[] args) {
        hasEqualSum(1, 1, 1);
        hasEqualSum(1, 1, 2);
        hasEqualSum(1, -1, 0);
    }
    public static boolean hasEqualSum(int firstValue, int secondValue, int thirdValue) {

        if ((firstValue + secondValue) == thirdValue) {
            System.out.println("The sum of " + firstValue + " and " + secondValue +
                    " are equal to " + thirdValue);
            return true;
        } else {
            System.out.println("The sum of " + firstValue + " and " + secondValue +
                    " are not equal to " + thirdValue);
            return false;
        }
    }
}
