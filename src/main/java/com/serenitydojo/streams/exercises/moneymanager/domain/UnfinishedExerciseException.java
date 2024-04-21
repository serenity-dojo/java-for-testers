package com.serenitydojo.streams.exercises.moneymanager.domain;

public class UnfinishedExerciseException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UnfinishedExerciseException(String strMsg) {
		super(strMsg);
	}

}