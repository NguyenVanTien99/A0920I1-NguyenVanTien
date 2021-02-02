package models;

import controllers.file.ReadFile;

public class Customer extends Human implements Comparable<Customer> {
    private String customerType;
    private Services service;

    public Customer(String fullName, String dateOfBirth, String gender, String idCard, String numberPhone, String email, String address, String customerType) {
        super(fullName, dateOfBirth, gender, idCard, numberPhone, email, address);
        this.customerType = customerType;
    }

    public Customer(String fullName, String dateOfBirth, String gender, String idCard, String numberPhone, String email, String address, String customerType, Services service) {
        super(fullName, dateOfBirth, gender, idCard, numberPhone, email, address);
        this.customerType = customerType;
        this.service = service;
    }


    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public Services getService() {
        return service;
    }

    public void setService(Services service) {
        this.service = service;
    }


    @Override
    public String toString() {
//        return super.toString() +
//                "customerType='" + customerType  ;

        return "\n" + "Full name: " + this.getFullName()+ "\n" +
                "Day of birth: " + getDateOfBirth() + "\n" +
                "Gender: " + this.getGender() + "\n" +
                "Id Card: " + this.getIdCard() + "\n" +
                "Phone Number: " + this.getPhoneNumber() + "\n" +
                "Email: " + this.getEmail() + "\n" +
                "Address: " + this.getAddress() + "\n" +
                "Customer Type: " + this.getCustomerType() + "\n";
    }

    public String addInformationBooking(){
        return this.getFullName() + ReadFile.COMMA +
                this.getDateOfBirth() + ReadFile.COMMA +
                this.getGender() + ReadFile.COMMA +
                this.getIdCard() + ReadFile.COMMA +
                this.getPhoneNumber() + ReadFile.COMMA +
                this.getEmail() + ReadFile.COMMA +
                this.getAddress() + ReadFile.COMMA +
                this.getCustomerType() + ReadFile.COMMA +
                this.service.getId();
    }

    public String addInformationCustomerCsv(){
        return this.getFullName() + ReadFile.COMMA +
                this.getDateOfBirth() + ReadFile.COMMA +
                this.getGender() + ReadFile.COMMA +
                this.getIdCard() + ReadFile.COMMA +
                this.getPhoneNumber() + ReadFile.COMMA +
                this.getEmail() + ReadFile.COMMA +
                this.getAddress() + ReadFile.COMMA +
                this.getCustomerType();
    }

    @Override
    public String showInfor() {
        return "\n" + "Full name: " + this.getFullName()+ "\n" +
                "Day of birth: " + getDateOfBirth() + "\n" +
                "Gender: " + this.getGender() + "\n" +
                "Id Card: " + this.getIdCard() + "\n" +
                "Phone Number: " + this.getPhoneNumber() + "\n" +
                "Email: " + this.getEmail() + "\n" +
                "Address: " + this.getAddress() + "\n" +
                "Customer Type: " + this.getCustomerType() + "\n" +
                "Id Service: " + this.service.getId();
    }


/*    @Override
    public int compareTo(Customer o) {
        int result = getFullName().substring(getFullName().lastIndexOf(" ") + 1).compareTo(o.getFullName().substring(o.getFullName().lastIndexOf(" ") + 1));
        if (result == 0) {
            result = getDateOfBirth().substring(6, 10).compareTo(o.getDateOfBirth().substring(6, 10));
        }
        return result;*/

    @Override
    public int compareTo(Customer o) {
        return this.getFullName().compareTo(o.getFullName());
    }
}
