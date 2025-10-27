public class IntEqualityPrinter {

    public static void main(String[] args) {
        printEqual(1,1,1);
        printEqual(1,1,2);
        printEqual(-1,-1,-1);
        printEqual(1, 2, 3);
        printEqual(1, 2, 1);
    }

    public static void printEqual(int firstValue, int secondValue, int thirdValue) {

        if (firstValue < 0 || secondValue < 0 || thirdValue < 0) {
            System.out.println("Invalid Value");
        } else {

            if (firstValue == secondValue && secondValue == thirdValue) {
                System.out.println("All numbers are equal");

            } else if (firstValue == secondValue || firstValue == thirdValue || secondValue == thirdValue) {
                System.out.println("Neither all are equal or different");

            } else {
                System.out.println("All numbers are different");
            }
        }
    }
}
