import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int sizeOfArray = scanner.nextInt();
            int[] arrayTest = new int[sizeOfArray];

            for (int i = 0; i < sizeOfArray; i++) {
                arrayTest[i] = scanner.nextInt();
            }

            int n = scanner.nextInt();
            int sum = 0;

            for (int i = 0; i < sizeOfArray; i++) {
                if (arrayTest[i] > n) {
                    sum += arrayTest[i];
                }
            }
            System.out.println(sum);
        }
    }
}