package _15_exception;

import java.util.List;

public class PersonManager {
    List<Person> personList;

    public PersonManager(List<Person> personList) {
        this.personList = personList;
    }

    public void addPerson(Person person){
        personList.add(person);
    }

//    public void updatePerson(Person person){
//
//    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    public void updatePerson(Person person) {
        int index = personList.indexOf(person);
        if(index == -1){
            // nếu không ton tai thi coi nhu la tao moi
            addPerson(person);
        } else {
            this.personList.set(index, person);
        }
    }
}
