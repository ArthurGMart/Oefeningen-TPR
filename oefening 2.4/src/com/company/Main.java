package com.company;
import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Scanner scanner = new Scanner (System.in);
        System.out.println("Kies een getal tussen de 10 en 100");
    int getal = scanner.nextInt();
        System.out.print(getal - 2);
        System.out.print("-");
        System.out.print(getal - 1);
        System.out.print("-");
        System.out.print(getal);
        System.out.print("-");
        System.out.print(getal + 1);
        System.out.print("-");
        System.out.print(getal + 2);

    }
}
