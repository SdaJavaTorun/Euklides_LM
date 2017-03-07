package com.sdajava.euklides;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a, b;

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe: ");
        a =  in.nextInt();
        System.out.println("Podaj druga liczbe: ");
        b = in.nextInt();

        while (a != b) {
            if (a > b)
                a -= b;
            else
                b -= a;
        }
        System.out.println("NWD = " + a);
    }
}
