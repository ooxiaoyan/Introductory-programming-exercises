package triangle_exercises;

import java.util.Scanner;

/**
 * Created by 筱湮 on 2018/7/13 0013.
 * Given a number n, print n lines, each with one asterisks
 * Example when n=3:
 * *
 * *
 * *
 */
public class DrawAVerticalLine {

    public static void main(String[] args) {

        System.out.print("Please enter a number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println("*");
        }
    }
}
