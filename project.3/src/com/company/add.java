package com.company;

import java.util.Scanner;

public class add {
    public static void main(String[] args)
    {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter n:");
        n=scan.nextInt();
        for(int i=1;i<=10;i++) {
            System.out.println(+n + " + " + i + " = " + (n + i));
        }

    }
}
