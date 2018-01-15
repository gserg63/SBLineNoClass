import sun.plugin.javascript.navig.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int SIZE = 10;
        char[]cells = new char[SIZE];

        for (int i = 0; i < cells.length; i++) {
            cells[i] = '.';
        }

        int position = 4;
        cells[position] = 'X';

        do {
            System.out.println(cells);
            Scanner scanner = new Scanner(System.in);
            String s;
            s = scanner.nextLine();
            System.out.printf("Вы ввели: %s\n", s);

            int shoot = Integer.parseInt(s);
            switch (cells[shoot]){
                case '.':
                    System.out.println("Промах!");
                    cells[shoot] = '*';
                    break;
                case 'X':
                    System.out.println("Попал!");
                    cells[shoot] = '-';
                    break;
                case '*':
                    System.out.println("Уже стреляли!");
                    break;
                default:
                    System.out.println("ERROR");
            }
        } while (cells[position] == 'X');
    }
}
