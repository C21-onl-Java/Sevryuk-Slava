import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature outside: ");
        int temperature = scanner.nextInt();
        if (temperature > -5) {
            System.out.println("Warm");
        } else if (temperature > -20) {
            System.out.println("Normal");
        } else {
            System.out.println("Cold");
        }
    }
}