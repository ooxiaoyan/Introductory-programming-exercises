package triangle_exercises;

import java.util.Scanner;

/**
 * Created by 筱湮 on 2018/7/12 0012.
 * Given a number n, print n asterisks on one line.
 * Example when n=8:
 * *******
 */
public class DrawAHorizontalLine {

    public static void main(String[] args) {

        System.out.print("Please enter a number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
    }
}
