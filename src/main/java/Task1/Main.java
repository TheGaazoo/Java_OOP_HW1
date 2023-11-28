package Task1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(); //экземпляр класса
        cat.setName("barsic");
        Fish fish = new Fish(); //добавили рыбу
        fish.setName("MEG");

        Duck duck = new Duck(); //добавили  утку
        duck.setName("Donald");

        Monkey monkey = new Monkey(); //добавили обезьяну
        monkey.setName("Nikodim");

        System.out.println(cat.getName());
        Dog dog = new Dog("max",new Chumka("chumka"), "petr",
                LocalDate.of(3,12,21));
        System.out.println(dog.getName());
        System.out.println(dog.getIllness());
        dog.getIllness().heal();
//        dog.toWakeUp("13:22");
//        cat.toWakeUp();
        ArrayList <Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
        animals.add(fish);
        animals.add(duck);
        System.out.println(monkey.getName());
        monkey.animalliveCycle();
       // dog.breathe();
        System.out.println(fish.getName());
        fish.FishliveCycle();
        
        System.out.println(duck.getName());
        duck.BirdliveCycle();
    }
}
