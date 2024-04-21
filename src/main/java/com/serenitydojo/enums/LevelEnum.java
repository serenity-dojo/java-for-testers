package com.serenitydojo.enums;

public enum LevelEnum implements IComparableByHeight {

	HIGH(4), MEDIUM(3), LOW(2), REALLY_LOW(1);

	LevelEnum(int levelCode) {
		this.levelCode = levelCode;
	}

	private final int levelCode;

	/**
	 * @return the levelCode
	 */
	public int getLevelCode() {
		return levelCode;
	}

	@Override
	public boolean isHighEnough(int minimumAllowedHeight) {
		return levelCode>=minimumAllowedHeight;
	}

}