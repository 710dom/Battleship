package battleship;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        char[] alphaChar;
        alphaChar = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        char[][] seeArray = new char[10][10];
        for (char[] row: seeArray) {
            Arrays.fill(row,'~');
        }
        System.out.print("  ");
        for (int i = 1; i < 11; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < seeArray.length; i++) {
            System.out.print(alphaChar[i] + " ");
            for (int j = 0; j < seeArray[i].length; j++) {
                System.out.print(seeArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}


