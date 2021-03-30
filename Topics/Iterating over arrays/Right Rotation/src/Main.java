import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String[] inputSplited = scanner.nextLine().trim().split("\\s+");
            Integer[] intArray = new Integer[inputSplited.length];
            for (int i = 0; i < inputSplited.length; i++) {
                intArray[i] = Integer.parseInt(inputSplited[i]);
            }
            Integer[] copiedArray = Arrays.copyOf(intArray, intArray.length);
            int nbrOfRotate = scanner.nextInt();
            for (int i = 0; i < nbrOfRotate % intArray.length; i++) {
                System.arraycopy(copiedArray, 0, intArray, 1, intArray.length - 1);
                intArray[0] = copiedArray[intArray.length - 1];
                copiedArray = Arrays.copyOf(intArray, intArray.length);
            }
            for (int i:intArray) {
                System.out.print(i + " ");
            }
        }
    }
}