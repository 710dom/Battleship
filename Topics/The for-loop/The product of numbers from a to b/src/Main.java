import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            long firstNumber = scanner.nextInt();
            long secondNumber = scanner.nextInt();
            for (long i = firstNumber + 1; i < secondNumber; i++) {
                firstNumber *= i;
            }
            System.out.println(firstNumber);
        }
    }
}