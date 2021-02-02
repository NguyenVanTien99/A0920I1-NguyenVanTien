package models;

import controllers.file.ReadFile;

public class Villa extends Services implements Comparable<Villa>{
    private String standardRoom;
    private String comfortableDecription;
    private double poolArea;
    private int numberOfFloors;

    public Villa() {
    }


    public Villa(String standardRoom, String comfortableDecription, double poolArea, int numberOfFloors) {
        this.standardRoom = standardRoom;
        this.comfortableDecription = comfortableDecription;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public Villa(String id, String servicesName, double areaOfUse, double rentalCosts, int numberOfPeopleMax, String rentType, String standardRoom, String comfortableDecription, double poolArea, int numberOfFloors) {
        super(id, servicesName, areaOfUse, rentalCosts, numberOfPeopleMax, rentType);
        this.standardRoom = standardRoom;
        this.comfortableDecription = comfortableDecription;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getComfortableDecription() {
        return comfortableDecription;
    }

    public void setComfortableDecription(String comfortableDecription) {
        this.comfortableDecription = comfortableDecription;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloor() {
        return numberOfFloors;
    }

    public void setNumberOfFloor(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", standardRoom='" + standardRoom + '\'' +
                ", comfortableDecription='" + comfortableDecription + '\'' +
                ", poolArea=" + poolArea +
                ", numberOfFloor=" + numberOfFloors
                ;
    }

    @Override
    public String showInfor() {
        return "\n" + "Id: " + this.getId()+ "\n" +
                "Services Name: " + getServicesName() + "\n" +
                "Area Of Use: " + this.getAreaOfUse() + "\n" +
                "get Renta Costs: " + this.getRentalCosts() + "\n" +
                "Number Of People Max: " + this.getNumberOfPeopleMax() + "\n" +
                "Rent Type: " + this.getRentType() + "\n" +
                "Standard Room: " + this.getStandardRoom() + "\n" +
                "Comfortable Decription: " + this.getComfortableDecription() + "\n" +
                "Pool Area: " + this.getPoolArea() + "\n" +
                "Number Of Floor: " + this.getNumberOfFloor() + "\n";
    }

    public String addFileCsv(){
        return getId() + ReadFile.COMMA +
                getServicesName() + ReadFile.COMMA +
                getAreaOfUse() + ReadFile.COMMA +
                getRentalCosts() + ReadFile.COMMA +
                getNumberOfPeopleMax() + ReadFile.COMMA +
                getRentType() + ReadFile.COMMA +
                getStandardRoom() + ReadFile.COMMA +
                getComfortableDecription()+ ReadFile.COMMA +
                getPoolArea() + ReadFile.COMMA +
                getNumberOfFloor() ;
    }

    @Override
    public int compareTo(Villa o) {
        return this.getServicesName().compareTo(o.getServicesName());
    }
}
