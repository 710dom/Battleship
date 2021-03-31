import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nbr_a = scanner.nextInt();
        int nbr_b = scanner.nextInt();
        int counterDivisibleByThree = 0;
        int sum = 0;
        for (int i = nbr_a; i <= nbr_b; i++) {
            if (i % 3 == 0) {
                sum += i;
                counterDivisibleByThree++;
            }
        }
        float result = (float) sum / (float) counterDivisibleByThree;
        System.out.println(result);
    }
}