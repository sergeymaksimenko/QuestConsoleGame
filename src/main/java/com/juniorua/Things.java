package com.juniorua;

/**
 * Created by asu on 08.05.2016.
 */
public enum Things {



    SOURCE("Исходный код", TextHub.THING_SOURCE_CODE_TAKE),
    STONE("Камень", TextHub.THING_STONE_TAKE),
    BOOK("Книга Thinking in Java",TextHub.THING_BOOK_TAKE),
    CCOMPIL("Компилятор C#", TextHub.THING_CSHARP_COMPIL_TAKE),
    JAVAC("Волшебный javac",TextHub.THING_JAVAC_TAKE),
    SWORD("Меч",TextHub.THING_SWORD_TAKE);


    private String name, greetingText;

    Things(String description, String greetingText) {
        this.name = description;
        this.greetingText = greetingText;
    }



    public String getName() {
    return name;
    }

}
