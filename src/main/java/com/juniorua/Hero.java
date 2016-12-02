package com.juniorua;

/**
 * Created by asu on 02.05.2016.
 */
public class Hero {
    public static Things pocket = null;
    public static Race race;
    public static String name;
    public static int energy;
    public static int damage;
    public static MapCreate map;


    public static void moveForward() {
        if (MapCreate.row+1 >= MapCreate.getCells().length)
            System.out.println("Туда нельзя идти");
        else {
            MapCreate.setCurrentCell(MapCreate.row + 1, MapCreate.col);
            MapCreate.getCurrentCell().heroCame();
        }
    }
    public static void moveBack() {
        if (MapCreate.row-1 < 0)
            System.out.println("Туда нельзя идти");
        else {
            MapCreate.setCurrentCell(MapCreate.row - 1, MapCreate.col);
            MapCreate.getCurrentCell().heroCame();
        }
    }
    public static void moveLeft() {
        if (MapCreate.col+1 >= MapCreate.getCells()[MapCreate.row].length)
            System.out.println("Туда нельзя идти");
        else {
            MapCreate.setCurrentCell(MapCreate.row, MapCreate.col + 1);
            MapCreate.getCurrentCell().heroCame();
        }
    }
    public static void moveRight() {
        if (MapCreate.col-1 < 0)
            System.out.println("Туда нельзя идти");
        else {
            MapCreate.setCurrentCell(MapCreate.row,MapCreate.col - 1);
            MapCreate.getCurrentCell().heroCame();
        }
    }
    public static void takeThing() {
        System.out.println(MapCreate.getCurrentCell().getThings().size());
        if (MapCreate.getCurrentCell().getThings().size() != 0) {
        Things thingInCell = MapCreate.getCurrentCell().getThings().get(0);
        MapCreate.getCurrentCell().getThings().remove(0);
        if (pocket == null) {
            pocket = thingInCell;
            System.out.println("Вы взяли " + thingInCell.getName());
        } else {
            dropThing();
            pocket = thingInCell;
            System.out.println("Вы взяли " + pocket.getName() + ". Вы можете взять только один предмет");
        }
    } else {
        System.out.println("Здесь нечего брать");
    }
    }

    public static void dropThing() {
        Things thing = pocket;
        MapCreate.getCurrentCell().getThings().add(thing);
        pocket = null;
        System.out.println("Вы выбросили " + thing.getName());
    }

    public static void setEnergyByRace() {
        switch (race.getId()) {
            case 1: {
                energy = 50;
                damage = 40;
                break;
            }
            case 2: {
                energy = 50;
                damage = 50;
                break;
            }
            case 3: {
                energy = 50;
                damage = 60;
                break;
            }
        }
    }
}
