import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int indexOfMax = 0;
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
            }
        int max = array[0];
        for (int i = 0; i < arraySize - 1; i++) {
            if (array[i+1] > max) {
                max = array[i + 1];
                indexOfMax = i + 1;
            }
        }
        System.out.println(indexOfMax);
    }
}