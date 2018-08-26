package com.company;

// Now this is a subclass of the type animal
// This is called inheritance because every single field & method that is in animal is going to be available to the subclasses dog and cats since it extends it
public class Dog extends Animal {

    public Dog() {


    }

    public String makeSound() {

        return "Woof";

    }

}
