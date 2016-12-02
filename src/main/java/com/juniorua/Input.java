package com.juniorua;


import java.util.Scanner;

/**
 * Created by asu on 10.05.2016.
 */
public class Input {


    public static String inputLine() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public static int inputInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
