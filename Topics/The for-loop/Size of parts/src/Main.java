import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int shipped = 0;
            int rejects = 0;
            int fixed = 0;
            for (int i = 0; i < n; i++) {
                int entry = scanner.nextInt();
                if (entry == 0) {
                    shipped++;
                } else if (entry == -1) {
                    rejects++;
                } else {
                    fixed++;
                }
            }
            System.out.print(shipped + " ");
            System.out.print(fixed + " ");
            System.out.print(rejects);
        }
    }
}