import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] box1 = new int[3];
            int[] box2 = new int[3];
            for (int i = 0; i < 3; i++) {
                box1[i] = scanner.nextInt();
            }
            for (int i = 0; i < 3; i++) {
                box2[i] = scanner.nextInt();
            }
            Arrays.sort(box1);
            Arrays.sort(box2);
            boolean b1 = true;
            int result = 0;
            if (box1[0] < box2[0]) {
                b1 = false;
            }
            for (int i = 0; i < 3; i++) {
                if (b1) {
                    if (box1[i] > box2[i]) {
                        result++;
                    }
                } else
                    if (box1[i] < box2[i]) {
                        result++;
                    }
            }

            if (result == 3 && b1) {
                System.out.println("Box 1 > Box 2");
            } else if (result == 3 && !b1) {
                System.out.println("Box 1 < Box 2");
            } else {
                System.out.println("Incompatible");
            }
        }
    }
}