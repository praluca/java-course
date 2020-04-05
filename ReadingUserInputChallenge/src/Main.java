import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        while (count < 10) {
            System.out.println("Enter number " + (count + 1));
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt) {
                int number = scanner.nextInt();
                sum += number;
                count ++;
            } else {
                System.out.println("Your number is wrong");
            }
            scanner.nextLine();
        }
        System.out.println("Your sum is: " + sum);
        scanner.close();
    }
}
