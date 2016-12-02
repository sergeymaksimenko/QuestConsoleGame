package com.juniorua;

/**
 * Created by asu on 07.05.2016.
 */
public class Output {

    public static void outputConsole(String[] str) {


        for (String line:str) {
           char[] c = line.toCharArray();
            for (int k = 0; k < c.length; k++) {
                System.out.print(c[k]);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void outputConsole(String str) {
        char[] c = str.toCharArray();
        for (int k = 0; k < c.length; k++) {
            System.out.print(c[k]);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
