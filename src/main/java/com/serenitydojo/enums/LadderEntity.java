package com.serenitydojo.enums;

public class LadderEntity implements IComparableByHeight {

	private final int height;

	public LadderEntity(int height) {
		this.height = height;
	}

	@Override
	public boolean isHighEnough(int minimumAllowedHeight) {
		return height >= minimumAllowedHeight;
	}

}