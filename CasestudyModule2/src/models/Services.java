package models;

import java.util.Objects;

public abstract class Services {
    private String id;
    private String servicesName;
    private double areaOfUse;
    private double rentalCosts;
    private int numberOfPeopleMax;
    private String rentType;

    public Services() {
    }

    public Services(String id, String servicesName, double areaOfUse, double rentalCosts, int numberOfPeopleMax, String rentType) {
        this.id = id;
        this.servicesName = servicesName;
        this.areaOfUse = areaOfUse;
        this.rentalCosts = rentalCosts;
        this.numberOfPeopleMax = numberOfPeopleMax;
        this.rentType = rentType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getServicesName() {
        return servicesName;
    }

    public void setServicesName(String servicesName) {
        this.servicesName = servicesName;
    }

    public double getAreaOfUse() {
        return areaOfUse;
    }

    public void setAreaOfUse(double areaOfUse) {
        this.areaOfUse = areaOfUse;
    }

    public double getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(double rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public int getNumberOfPeopleMax() {
        return numberOfPeopleMax;
    }

    public void setNumberOfPeopleMax(int numberOfPeopleMax) {
        this.numberOfPeopleMax = numberOfPeopleMax;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    @Override
    public String toString() {
        return "id='" + id + '\'' +
                ", servicesName='" + servicesName + '\'' +
                ", areaOfUse=" + areaOfUse +
                ", rentalCosts=" + rentalCosts +
                ", numberOfPeopleMax=" + numberOfPeopleMax +
                ", rentType='" + rentType
                ;
    }

    public abstract String showInfor();


}
