package triangle_exercises;

import java.util.Scanner;

/**
 * Created by 筱湮 on 2018/7/13 0013.
 * Given a number n, print n lines, each with one more asterisk than the last (i.e. one on the first line, two on the second,etc.)
 * Example when n=3:
 * *
 * **
 * ***
 */
public class DrawARightTriangle {

    public static void main(String[] args) {

        System.out.print("Please enter a number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
