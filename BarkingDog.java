public class BarkingDog {

    public static void main(String[] args) {

        shouldWakeUp(true,1);
        shouldWakeUp(true,2);
        shouldWakeUp(true,8);
        shouldWakeUp(true,-1);

    }
    public static boolean shouldWakeUp(boolean isBarking, int hourOfday) {

        if (hourOfday < 0 || hourOfday > 23) {
            return false;
        } else if ((isBarking == true && hourOfday < 8) || (isBarking == true && hourOfday > 22)) {
            return true;

        } else {
            return false;

        }
    }
}
