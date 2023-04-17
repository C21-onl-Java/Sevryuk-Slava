import java.util.Scanner;

public class Ex0 {
    public static void main(String[] args) {
        int[] array = {3, 4, 5, 7, 11};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для поиска: ");
        int number = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Число " + number + " найдено в массиве.");
        } else {
            System.out.println("Число " + number + " не найдено в массиве.");
        }
    }
}