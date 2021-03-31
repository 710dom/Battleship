import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nbrElement = scanner.nextInt();
        int result = 0;
        for (int i = 0; i < nbrElement; i++) {
            int input = scanner.nextInt();
            if (input % 4 == 0 && input > result) {
                result = input;
            }
        }
        System.out.println(result);
    }
}
