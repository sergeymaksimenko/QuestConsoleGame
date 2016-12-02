package com.juniorua;

/**
 * Created by asu on 09.05.2016.
 */
public enum Entities {

    GNOME("Мудрый гном", null),
    WARDER("Стражник",null),
    WIZARD("Волшебник",null),
    DRAGON("Дракон лени",null);

    private String name;

    Entities(String descriptoin, Things o) {
        this.name = descriptoin;
    }

    public String getName() {
        return name;
    }
}
