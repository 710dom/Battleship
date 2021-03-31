package battleship;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char[][] seeArray = new char[10][10];
        initSheet(seeArray);
        coordinatesCaptures(scanner);

    }

    private static void coordinatesCaptures(Scanner scanner) {
        int[] coordinatesArray = null;
        boolean isValid = false;
        while (!isValid) {
            System.out.println("Enter the coordinates of the Aircraft Carrier (5 cells):");
            coordinatesArray = coordinatesInt(scanner);
            isValid = validateCoordinates(coordinatesArray, 5);

        }
        System.out.println(coordinatesArray[0]);
        System.out.println(coordinatesArray[1]);
        System.out.println(coordinatesArray[2]);
        System.out.println(coordinatesArray[3]);
    }

    private static boolean validateCoordinates(int[] coordinatesArray, int nbrOfcells) {
        return true;
    }

    private static int[] coordinatesInt(Scanner scanner) {
        String[] coordinates = scanner.nextLine().toUpperCase().trim().split("\\s+");
        int[] coordinatesArray = new int[4];
        coordinatesArray[0] = coordinates[0].charAt(0) - 'A'; //X1
        coordinatesArray[1] = Integer.parseInt(coordinates[0].substring(1)) - 1; //Y1
        coordinatesArray[2] = coordinates[1].charAt(0) - 'A'; //X2
        coordinatesArray[3] = Integer.parseInt(coordinates[1].substring(1)) - 1; //Y2
        return coordinatesArray;
    }

    private static void initSheet(char[][] seeArray) {
        char[] alphaChar;
        alphaChar = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
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


