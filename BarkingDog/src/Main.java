public class Main {
    public static void main(String[] args) {
       boolean wakeUp = BarkingDog.shouldWakeUp(true, 1);
        System.out.println(wakeUp);
        wakeUp = BarkingDog.shouldWakeUp(false,2);
        System.out.println(wakeUp);
        wakeUp = BarkingDog.shouldWakeUp(true, 8);
        System.out.println(wakeUp);
        wakeUp = BarkingDog.shouldWakeUp(true, -1);
        System.out.println(wakeUp);
    }
}
