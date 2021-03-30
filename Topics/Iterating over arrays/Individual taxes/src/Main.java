import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int comp = sc.nextInt();
        int[] inc = new int[comp];
        int[] tax = new int[comp];
        int x = 0;
        int res = 0;
        for (int i = 0; i < comp; i++) {
            inc[i] = sc.nextInt();
        }
        for (int i = 0; i < comp; i++) {
            tax[i] = sc.nextInt() * inc[i];
            if (x < tax[i]) {
                x = tax[i];
                res = i + 1;
            }
        }
        System.out.println(res);
    }
}