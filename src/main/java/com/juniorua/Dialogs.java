package com.juniorua;

/**
 * Created by asu on 07.05.2016.
 */
public class Dialogs {

       public static String line;
        public static int id;
    public static void startDialog() {
        Output.outputConsole("Привет, соискатель, я рад, что ты взялся за голову, и решил убить в себе дракона лени." +
                "\n Долгий и тернистый путь тебе предстоит. Сперва введи имя свое. \n");

           line = Input.inputLine();
           Hero.name=line;

        Output.outputConsole("ОТлично, " + Hero.name + ". Укажи свою рассу\n");

        while(true) {
        for (Race race:Race.values())
            Output.outputConsole(race.getId() + " - " + race.getDscription() + "\n");

            id = Input.inputInt();
            if (id < 0 || id > Race.values().length)
                Output.outputConsole("ХА-ХА! Хочешь вызвать UpperBoundException?  Меня не проведешь, вводи правильные цифры!\n");
            else {
                Hero.race = Race.getRaceByID(id);
                break;
            }
        }


    }

    public static void beginGameDialog() {
        Output.outputConsole("Ну чтож, все формальности соблюдены. Желаю тебе победить дракона." +
                "\n ИГРА НАЧАЛАСЬ! \n");
    }
    public static void standartDialog() {
        Output.outputConsole("Введите команду, либо \"хелп\" для помощи\n");
    }


}
