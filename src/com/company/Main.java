package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.print("Enter day of week(1) or number(2)");
        int enter = scanner.nextInt();
        for (int i = 0;i < number;i++){
            if (enter == 1){
                System.out.println("Enter day of week");
                String str = scanner.next();
                System.out.println(str);
            } else if (enter == 2){
                System.out.print("Number :");
                int num = scanner.nextInt();
                System.out.println(num);
            }
        }


    }
}
