package com.juniorua;

/**
 * Created by asu on 02.05.2016.
 */
public enum Race {
        JUNIOR("Джуниор",1,50,50),
        MIDDLE("Мидл",2,50,65),
        SENIOR("Сениор-помидор",3,50,70);

    private final String description;
    private int id, energy, damage;


    Race(String description, int id, int energy, int damage) {
        this.description = description;
        this.id = id;
        this.energy = energy;
        this.damage = damage;
    }

    public String getDscription() {
        return description;
    }
    public int getId() {
        return id;
    }
    public static Race getRaceByID(int id) {
        Race tmp = null;
        for (Race race : Race.values()) {
            if (race.getId() == id) {
               tmp = race;
                break;
            }
        }
        return tmp;
    }


}
