package com.juniorua;

/**
 * Created by asu on 07.05.2016.
 */
public enum Commands {

    FORWARD("вперед"),
    BACK("назад"),
    LEFT("влево"),
    RIGHT("вправо"),
    TAKE("поднять"),
    DROP("бросить"),
    SPEAK("говорить"),
    GIVE("отдать"),
    POCKET("карман"),
    HELP("хелп");

    private String command;

    Commands(String command) {
        this.command = command;
    }

    public String getCommand() {
        return command;
    }
}
