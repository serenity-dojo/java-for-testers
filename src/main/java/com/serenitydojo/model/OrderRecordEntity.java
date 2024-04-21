package com.serenitydojo.model;
import java.util.List;

public record OrderRecordEntity(String id, String name, int quanity, double itemPrice, double totalPrice,
		List<String> tags) {

}