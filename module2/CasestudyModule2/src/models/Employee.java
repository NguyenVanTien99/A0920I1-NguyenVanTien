package models;

public class Employee extends Human {
    private String idEmployee;
    private String level;
    private String position;
    private double salary;

    public Employee(String fullName, String dateOfBirth, String gender, String idCard, String numberPhone, String email, String address, String level, String position, double salary, String idEmployee) {
        super(fullName, dateOfBirth, gender, idCard, numberPhone, email, address);
        this.level = level;
        this.position = position;
        this.salary = salary;
        this.idEmployee = idEmployee;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
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
                "Customer Type: " + this.getIdEmployee() + "\n" +
                "Position: " + this.getPosition() + "\n" +
                "Level: " + this.getLevel() + "\n" +
                "Salary: " + this.getSalary() + "\n" ;
    }
}
