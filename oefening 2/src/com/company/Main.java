package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double mijlen = 1.6;
	Scanner scanner = new Scanner(System.in);
	System.out.println("Type het aantal mijlen") ;
    double userinput = scanner.nextDouble();
	System.out.println(userinput * mijlen) ;
    }
}
