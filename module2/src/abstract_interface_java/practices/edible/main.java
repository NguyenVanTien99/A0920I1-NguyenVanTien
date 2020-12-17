package abstract_interface_java.practices.edible;

import abstract_interface_java.practices.edible.animal.Animal;
import abstract_interface_java.practices.edible.animal.Chicken;
import abstract_interface_java.practices.edible.animal.Tiger;
import abstract_interface_java.practices.edible.edible.Edible;
import abstract_interface_java.practices.edible.fruit.Apple;
import abstract_interface_java.practices.edible.fruit.Fruit;
import abstract_interface_java.practices.edible.fruit.Orange;

public class main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for(Animal animal : animals){
            animal.makeSound();
            System.out.println(animal.makeSound());

            if(animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }

        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
