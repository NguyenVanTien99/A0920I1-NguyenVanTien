package models;

import controllers.file.ReadFile;

public class Room extends Services implements Comparable<Room> {
    private String accompaniedServiceFree;

    public Room(String accompaniedServiceFree) {
        this.accompaniedServiceFree = accompaniedServiceFree;
    }

    public Room(String id, String servicesName, double areaOfUse, double rentalCosts, int numberOfPeopleMax, String rentType, String accompaniedServiceFree) {
        super(id, servicesName, areaOfUse, rentalCosts, numberOfPeopleMax, rentType);
        this.accompaniedServiceFree = accompaniedServiceFree;
    }

    public Room() {
    }

    public String getAccompaniedServiceFree() {
        return accompaniedServiceFree;
    }

    public void setAccompaniedServiceFree(String accompaniedServiceFree) {
        this.accompaniedServiceFree = accompaniedServiceFree;
    }

    @Override
    public String toString() {

        return super.toString() +
                ", accompaniedServiceFree" + accompaniedServiceFree
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
               "Accompanied Service Free: " + this.getAccompaniedServiceFree() ;
    }

    public String addFileCsv(){
        return getId() + ReadFile.COMMA +
                getServicesName() + ReadFile.COMMA +
                getAreaOfUse() + ReadFile.COMMA +
                getRentalCosts() + ReadFile.COMMA +
                getNumberOfPeopleMax() + ReadFile.COMMA +
                getRentType() + ReadFile.COMMA +
                getAccompaniedServiceFree();
    }

    @Override
    public int compareTo(Room o) {
        return this.getServicesName().compareTo(o.getServicesName());
    }
}
