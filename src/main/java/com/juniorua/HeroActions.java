package com.juniorua;

/**
 * Created by asu on 14.05.2016.
 */
public class HeroActions {
    public static void processingCommand(String inputCommand) {
        Commands chooseCommand = null;
        for (Commands command:Commands.values()) {
            if (inputCommand.equals(command.getCommand())) {
                chooseCommand = command;
            }
        }
        if (chooseCommand == null) {
            System.out.println("Моя твоя не понимать. Попробуй \"хелп\" чтобы узнать о командах.\n");

        } else {
            switch (chooseCommand) {
                case FORWARD: {
                    Hero.moveForward();
                    break;
                }
                case BACK: {
                    Hero.moveBack();
                    break;
                }
                case LEFT: {
                    Hero.moveLeft();
                    break;
                }
                case RIGHT: {
                    Hero.moveRight();
                    break;
                }
                case TAKE: {
                    Hero.takeThing();
                    break;
                }
                case DROP: {
                    Hero.dropThing();
                    break;
                }
                case POCKET: {
                    System.out.println("У вас в кармане " + ((Hero.pocket == null) ? "пусто\n":Hero.pocket.getName()));
                    break;
                }
                case HELP: {
                    Output.outputConsole("Вы можете вводить следующие команды: \n");
                    for (Commands command:Commands.values())
                        System.out.println(command.getCommand());
                    break;
                }
                case SPEAK: {
                    if (MapCreate.currentCell.getEntity() != null) {
                        SpeakWithEntity.analizator(MapCreate.currentCell.getEntity());
                    } else {
                        Output.outputConsole("Не с кем здесь разговаривать. Разве что с самим собой. \n");
                    }
                    break;
                }
            }
        }
    }
    public static void processingInput() {
        String line = Input.inputLine();
        processingCommand(line);

    }
}
