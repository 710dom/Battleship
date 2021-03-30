import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(new File("call_stat.txt"))) {
            while (scanner.hasNext()) {
                String first = scanner.next();
                String second = scanner.next();
                int duration = scanner.nextInt();
                if (duration > 60) {
                    System.out.println(first);
                }
            }
        }
    }
}