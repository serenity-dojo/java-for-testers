package com.serenitydojo.vars;

public class Car {
    private final String make;
    private final String model;
    private final int year;
    private final String numberPlate;

    public Car(String make, String model, int year, String numberPlate) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.numberPlate = numberPlate;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (year != car.year) return false;
        if (!make.equals(car.make)) return false;
        if (!model.equals(car.model)) return false;
        return numberPlate.equals(car.numberPlate);
    }

    @Override
    public int hashCode() {
        int result = make.hashCode();
        result = 31 * result + model.hashCode();
        result = 31 * result + year;
        result = 31 * result + numberPlate.hashCode();
        return result;
    }
}
