package com.serenitydojo.vars;

import org.junit.Test;

import org.assertj.core.api.Assertions;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class WhenUsingRecords {
    @Test
    public void creatingAnImmutableObject(){
        Car car = new Car("Tesla","Model S",2020,"ABC1213");

        assertThat(car.getMake()).isEqualTo("Tesla");
    }

    @Test
    public void creatingASetOfCars(){
        Car car1 = new Car("Tesla","Model S",2020,"ABC1213");
        Car car2 = new Car("Tesla","Model S",2020,"ABC1213");

        Set<Car> theCars = new HashSet<>();
        theCars.add(car1);
        theCars.add(car2);


        assertThat(theCars).hasSize(2);
    }

    @Test
    public void creatingASetOfVehicle(){
        Vehicle car1 = new Vehicle("Tesla","Model S",2020,"ABC1213");
        Vehicle car2 = new Vehicle("Tesla","Model S",2020,"ABC1213");

        Set<Vehicle> theCars = new HashSet<>();
        theCars.add(car1);
        theCars.add(car2);

        //
        assertThat(car1.numberPlate()).isEqualTo("ABC1213");

        assertThat(theCars).hasSize(1);
    }
}
