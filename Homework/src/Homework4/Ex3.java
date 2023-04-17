public class Ex3 {
    public static void main(String[] args) {
        int[] array1 = {5, 7, 9, 15, 17};
        int[] array2 = {5, 3, 2, 7, 9};

        System.out.print("Массив 1: ");
        printArray(array1);

        System.out.print("Массив 2: ");
        printArray(array2);

        double average1 = getAverage(array1);
        double average2 = getAverage(array2);

        if (average1 > average2) {
            System.out.println("Среднее арифметическое первого массива больше: " + average1);
        } else if (average2 > average1) {
            System.out.println("Среднее арифметическое второго массива больше: " + average2);
        } else {
            System.out.println("Средние арифметические обоих массивов равны: " + average1);
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / array.length;
    }
}