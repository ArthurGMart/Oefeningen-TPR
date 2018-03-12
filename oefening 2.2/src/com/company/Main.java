package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
 System.out.println("\n");
 int minuten = 525600;
 int min = 43200;
 Scanner scanner = new Scanner(System.in);
 System.out.println("Hoe oud ben jij?");
 int jaar = scanner.nextInt();
 System.out.println("Hoeveel maanden komen daar nog bij?");
 int maanden = scanner.nextInt();
        System.out.println("Jij bent");
        System.out.println((minuten * jaar)+ (min * maanden));
        System.out.println("minuten oud");




    }
}
