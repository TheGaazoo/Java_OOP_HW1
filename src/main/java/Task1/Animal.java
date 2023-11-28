package Task1;

import java.sql.Time;
import java.time.LocalDate;

public class Animal {
    private String name;
    private Illness illness;
    private String ownerName;
    private LocalDate birthday;

    public Animal() {
    }

    public Animal(String name, Illness illness, String ownerName, LocalDate birthday) {
        this.name = name;
        this.illness = illness;
        this.ownerName = ownerName;
        this.birthday = birthday;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Illness getIllness() {
        return illness;
    }

    private void toWakeUp() {
        System.out.println(name + " wake up");
    }

    private void toWakeUp(String time) {
        System.out.println(getClass().getSimpleName() + " wake up is " + time);
    }

    private void toGo() { // add toGo
        System.out.println(getClass().getSimpleName() + " go");
    }

    private void fly() { // add fly
        System.out.println(getClass().getSimpleName() + "to fly");
    }

    private void swim() { // add swim
        System.out.println(getClass().getSimpleName() + "to swim");
    }

    private void eat() {
        System.out.println(getClass().getSimpleName() + "to ate");

    }

    private void sleep() {
        System.out.println(getClass().getSimpleName() + " go to bed");
    }

    private void play() {
        System.out.println(getClass().getSimpleName() + " go to play");
    }

    public void animalliveCycle() {
        toWakeUp();
        eat();
        play();
        sleep();
        toGo();
        swim();
    }

    public void FishliveCycle() {
        toWakeUp();
        eat();
        swim();
        sleep();
    }

    public void BirdliveCycle() {
        toWakeUp();
        eat();
        fly();
        swim();
        toGo();
        sleep();
    }

    public void breathe() {
        System.out.println("breathe");
    }
}
