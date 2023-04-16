import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to determine the color of the rainbow: ");
        int num = sc.nextInt();
        String color;
        switch (num) {
            case 1:
                color = "red";
                break;
            case 2:
                color = "orange";
                break;
            case 3:
                color = "yellow";
                break;
            case 4:
                color = "green";
                break;
            case 5:
                color = "blue";
                break;
            case 6:
                color = "indigo";
                break;
            case 7:
                color = "violet";
                break;
            default:
                color = "invalid number";
                break;
        }
        System.out.println( color);
    }
}