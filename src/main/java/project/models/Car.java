package project.models;

import java.util.List;

public class Car {
    private Long id;
    private String name;
    private Manufacturer manufacturer;
    private List<Driver> drivers;

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setManufacturer(project.models.Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setDrivers(List<project.models.Driver> drivers) {
        this.drivers = drivers;
    }
}
