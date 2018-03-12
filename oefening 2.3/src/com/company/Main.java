package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n");
        System.out.println("Typ het startbedrag");

        double startbedrag = scanner.nextDouble();
        System.out.println("Type het rentepercentage");
        double rentepercentage = scanner.nextDouble();

        System.out.println(rentepercentage / 10 * startbedrag);




    }
}
