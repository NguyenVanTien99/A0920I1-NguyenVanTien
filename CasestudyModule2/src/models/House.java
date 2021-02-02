package models;

import controllers.file.ReadFile;

public class House extends Services implements Comparable<House> {
    private String standardRoom;
    private String comfortDescription;
    private int numberofFloors;

    public House(String standardRoom, String comfortDescription, int numberofFloors) {
        this.standardRoom = standardRoom;
        this.comfortDescription = comfortDescription;
        this.numberofFloors = numberofFloors;
    }

    public House(String id, String servicesName, double areaOfUse, double rentalCosts, int numberOfPeopleMax, String rentType, String standardRom, String comfortDescription, int numberofFloors) {
        super(id, servicesName, areaOfUse, rentalCosts, numberOfPeopleMax, rentType);
        this.standardRoom = standardRom;
        this.comfortDescription = comfortDescription;
        this.numberofFloors = numberofFloors;
    }

    public House() {
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getComfortDescription() {
        return comfortDescription;
    }

    public void setComfortDescription(String comfortDescription) {
        this.comfortDescription = comfortDescription;
    }

    public int getNumberofFloors() {
        return numberofFloors;
    }

    public void setNumberofFloors(int numberofFloors) {
        this.numberofFloors = numberofFloors;
    }

    @Override
    public String toString() {

        return  super.toString() +
                ", standardRoom='" + standardRoom + '\'' +
                ", comfortDescription='" + comfortDescription + '\'' +
                ", numberofFloors=" + numberofFloors ;
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
                "Comfort Description: " + this.getComfortDescription() + "\n" +
                "Number of Floors: " + this.getNumberofFloors();
    }

    public String addFileCsv(){
        return getId() + ReadFile.COMMA +
                getServicesName() + ReadFile.COMMA +
                getAreaOfUse() + ReadFile.COMMA +
                getRentalCosts() + ReadFile.COMMA +
                getNumberOfPeopleMax() + ReadFile.COMMA +
                getRentType() + ReadFile.COMMA +
                getStandardRoom() + ReadFile.COMMA +
                getComfortDescription() + ReadFile.COMMA +
                getNumberofFloors();

    }


    @Override
    public int compareTo(House o) {
        return this.getServicesName().compareTo(o.getServicesName());
    }
}
