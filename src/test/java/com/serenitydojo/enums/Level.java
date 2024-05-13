package com.serenitydojo.enums;

public enum Level implements ComparableByHeight {
    HIGH(3), MEDIUM(2), LOW(1);

    private final int levelCode;

    Level(int levelCode) {
        this.levelCode = levelCode;
    }

    public int getLevelCode() {
        return levelCode;
    }

    public boolean isHighEnough(int expectedLevel){
        return levelCode >= expectedLevel;
    }
}
