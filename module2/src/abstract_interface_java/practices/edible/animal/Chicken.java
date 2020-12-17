package abstract_interface_java.practices.edible.animal;

import abstract_interface_java.practices.edible.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound(){
        return "chicken: aoaoao";
    }

    @Override

    public String howToEat(){
        return "Could be friend";
    }

}


