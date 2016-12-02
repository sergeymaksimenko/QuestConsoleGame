package com.juniorua;

import java.io.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {

        MapCreate.mapCreate();
        Dialogs.startDialog();
        Hero.setEnergyByRace();
        Dialogs.beginGameDialog();
        MapCreate.setCurrentCell(0, 1);
        while (true) {
          //  System.out.println(MapCreate.row + " " + MapCreate.col);
            HeroActions.processingInput();

        }



}
}
