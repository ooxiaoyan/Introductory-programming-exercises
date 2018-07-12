package diamond_exercises;

import java.util.Scanner;

/**
 * Created by 筱湮 on 2018/7/13 0013.
 * Given a number n, print a centered triangle. Example for n=3:
 *   *
 *  ***
 * *****
 */
public class IsoscelesTriangle {

    public static void main(String[] args) {

        System.out.print("Please enter a number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = num-i; j > 1; j--) {
                System.out.print(" ");
            }
        for (int k = i*2+1; k > 0; k--) {
            System.out.print("*");
        }
            System.out.println();
        }
    }
}
