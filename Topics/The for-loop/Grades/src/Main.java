import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nbrInput = scanner.nextInt();
        int nbrA = 0;
        int nbrB = 0;
        int nbrC = 0;
        int nbrD = 0;
        for (int i = 0; i < nbrInput; i++) {
            int input = scanner.nextInt();
            if (input == 5) {
                nbrA++;
            } else if (input == 4) {
                nbrB++;
            } else if (input == 3) {
                nbrC++;
            } else if (input == 2) {
                nbrD++;
            }
        }
        System.out.println(nbrD + " " + nbrC + " " + nbrB + " " + nbrA);
    }
}