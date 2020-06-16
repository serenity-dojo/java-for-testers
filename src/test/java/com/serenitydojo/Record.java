package com.serenitydojo;

import java.util.List;

record Order(String id, String name, int quanity, double itemPrice, double totalPrice, List<String>tags) {}
