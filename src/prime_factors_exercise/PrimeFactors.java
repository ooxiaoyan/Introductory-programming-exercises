package prime_factors_exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by 筱湮 on 2018/7/13 0013.
 Prime Factors Exercise
 Write a method generate(int n) that given an integer N will return a list of integers such that the numbers are the factors of N and are arranged in increasing numerical order.
 For example, generate(1) should return an empty list and generate(30) should return the numbers: 2,3,5.
 */
public class PrimeFactors {

    public static void main(String[] args) {

        System.out.print("Please enter a number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if (num <= 0) {
            System.out.println("Please enter a positive integer: ");
        }

        System.out.println(generate(num));
    }

    public static List generate(int n) {

        List result = new ArrayList();

        if (n == 1) {
            result.add(1);
        }

        for (int i = 2; i <= n; i++) {
            if (isPrime(i) && n % i == 0) {
                result.add(i);
                n = n / i;
            }
        }
        return result;
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
