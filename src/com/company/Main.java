package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scan.nextInt();
        scan.nextLine();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {


                System.out.println("FizzBuzz");

            } else if (i % 5 == 0) {

                System.out.println("Buzz");

            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            }

            else {
                System.out.println(i);
            }

        }

        //FIZZBUZZ BONUS
        System.out.println("Here are multiples of 7,17,23");

        for (int i = 1; i <= n; i++) {
            {
                if (i % 7 == 0 && i % 17 == 0 && i % 23 == 0)
                    System.out.println("Multipel of 7,17,23");

            }

            if (i % 7 == 0) {
                System.out.println(i);
                System.out.println("Multipel of 7");

            } else if (i % 17 == 0) {
                System.out.println(i);
                System.out.println("Multipel of 17");

            } else if (i % 23 == 0) {
                System.out.println(i);
                System.out.println("Multipel of 23");

            }

        }
    }

}





