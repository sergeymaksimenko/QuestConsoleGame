package com.juniorua;

/**
 * Created by asu on 02.05.2016.
 */
public class Thing {

    String name;
    String takeText;

    public Thing(String name, String takeText) {
        this.name = name;
        this.takeText = takeText;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Thing{" +
                "name='" + name + '\'' +
                ", takeText='" + takeText + '\'' +
                '}';
    }
}
