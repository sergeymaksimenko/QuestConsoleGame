package com.juniorua;

import java.util.ArrayList;

/**
 * Created by asu on 02.05.2016.
 */
public class Cell {
    private Entities entity;
    private ArrayList<Things> things = new ArrayList<>();
    String greetingText;

    public Cell(Entities entity, Things thing, String greetingText) {
        this.entity = entity;
        if (thing != null) {
            things.add(thing);
        }
        this.greetingText = greetingText;
    }

    public void heroCame() {
        System.out.println(getGreetingText());
        if (things.size() > 0) {
            System.out.println("У меня под ногами лежит " + thingsToString());
        }
        if (getEntity() != null)
            System.out.println("Передо мной стоит " + getEntity().getName() + ". Может с ним поговорить?");
    }
    public Entities getEntity() {
        return entity;
    }

    public void setEntity(Entities entity) {
        this.entity = entity;
    }

    public String getGreetingText() {
        return greetingText;
    }

    public void setGreetingText(String greetingText) {
        this.greetingText = greetingText;
    }

    public ArrayList<Things> getThings() {
        return things;
    }


    public String thingsToString() {
        String result = new String("");
        if (things.size() > 0) {
            for (Things thing:things)
                result = result + " " + thing.getName();
        }
        return result;
    }


}
