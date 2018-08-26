package com.company;

// Single line comment
/*
* Multiline comment
*/

import java.util.Scanner;
import java.util.*;

public class Animal {

    // public - available to anyone else
    // private - can be accessed by other methods in the class
    // protected - this value can only be accessed by other code in the package
    // static - this number is going to be shared by every animal object that is created
    // final - a constant that cannot be changed
    // double - this is a variable type that allows you to enter decimal places(make sure final is defined with all uppercase, and can't be a subset)
    // Scanner() - allow us to accept user input from the keyboard
    // System.in - you want to get data from the keyboard
    // constructor - function that is needed when anytime an animal object is created
    // super() - calls whatever the superclass was for this animal to be executed
    // System.out.println("....") - basic print function
    // this - a way to refer to the object that is created (no other way to do that)
    // hasNextLine() - return true if they enter the data type string
    // hasNextInt() - return true if they enter the data type Int
    // hasNextFloat() - return true if they enter the data type float
    // hasNextDouble() - return true if they enter the data type double
    // hasNextBoolean() - return true if they enter the data type boolean
    // hasNextByte() - return true if they enter the data type byte
    // .toString - convert any data into string
    // continue - allow the program to jump out of this current iterations of going through the loop


    public static final double FAVNUMBER = 1.6180;

    private String name;
    private int weight;   // int can ahave a value between -2^31 to 2^31
    private boolean hasOwner = false;
    private byte age;  // byte can have a value of -28 to 127
    private long uniqueID; // long can have a value of -2^63 to 2^63
    private char favouriteChar;
    private double speed;
    private float height;

    protected static int numberOfAnimals = 0;

    static Scanner userInput = new Scanner(System.in);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isHasOwner() {
        return hasOwner;
    }

    public void setHasOwner(boolean hasOwner) {
        this.hasOwner = hasOwner;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public long getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(long uniqueID) {
        this.uniqueID = uniqueID;
        System.out.println("Unique ID set to: " + this.uniqueID);

    }

    public void setUniqueID() {
        long minNumber = 1;
        long maxNumber = 1000000;

        this.uniqueID = minNumber + (long) (Math.random() * ((maxNumber - minNumber) + 1));
        String stringNumber = Long.toString(maxNumber);

        int numberString = Integer.parseInt(stringNumber);
        System.out.println("Unique ID set to: " + this.uniqueID);

    }

    public char getFavouriteChar() {
        return favouriteChar;
    }

    public void setFavouriteChar(char favouriteChar) {
        this.favouriteChar = favouriteChar;
    }

    public void setFavouriteChar() {
        int randomNumber = (int) (Math.random() * 126) + 1;

        this.favouriteChar = (char) randomNumber;

        if(randomNumber == 32){

            System.out.println("Favorite character set to Space");

        } else if(randomNumber == 10) {

            System.out.println("Favorite character set to Newline");

        } else {

            System.out.println("Favorite character set to " + this.favouriteChar);

        }

        if((randomNumber > 97) && (randomNumber < 122)){

            System.out.println("Favorite character is a lowercase");

        }

        if(((randomNumber > 97) && (randomNumber < 122)) || ((randomNumber > 64) && (randomNumber < 91))){

            System.out.println("Favorite character is a letter");

        }

        int whichIsBigger = (50 > randomNumber) ? 50 : randomNumber;    // this compares them and return either 50 or randomNumber

        // switch statement

        switch (randomNumber){

            case 8:
                System.out.println("Favourite character set to backspace");
                break;

            case 10:
            case 11:
            case 12:
                System.out.println("Favourite character set to backspace");
                break;

            default:
                System.out.println();
                break;

        }

    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    protected static void countTo(int startingNumber){

        for(int i = startingNumber; i <= 100; i++){

            if(i == 90) continue;

            System.out.println(i);

        }
    }

    protected static String printNumbers(int maxNumbers){

        // while loop
        int i = 1;

        while(i < (maxNumbers / 2)){

            System.out.println(i);
            i++;

            // To jump out of this loop
            if(i == (maxNumbers / 2)) break;


        }

        Animal.countTo(maxNumbers/2);

        return "End of printNumbers";

    }

    protected static void guessMyNumber(){

        // do-while loop
        int number;

        do {

            System.out.println("Guess Number up to 100");

            while(!userInput.hasNextInt()){

                String numberEntered = userInput.next();
                System.out.printf("%s is not a number\n", numberEntered);

                // use %d when you have byte, short, int, or long
                // use %f when you have a float or double
            }

            number = userInput.nextInt();

        } while(number != 50);
    }

    public String makeSound(){

        return "Grrrr";

    }

    public static void speakAnimal(Animal randAnimal){

        System.out.println("Animal says " + randAnimal.makeSound());
    }

    public Animal() {

        numberOfAnimals++; // same as: numberOfAnimals = numberOfAnimals + 1;

        int sumOfNumbers = 5 + 1;
        System.out.println("5 + 1 = " + sumOfNumbers);

        int diffOfNumbers = 5 - 1;
        System.out.println("5 - 1 = " + diffOfNumbers);

        int multOfNumbers = 5 * 1;
        System.out.println("5 * 1 = " + multOfNumbers);

        int divOfNumbers = 5 / 1;
        System.out.println("5 / 1 = " + divOfNumbers);

        int modOfNumbers = 5 % 1;
        System.out.println("5 % 1 = " + modOfNumbers);

        System.out.print("Enter the name: \n");

        // hasNextInt,

        if(userInput.hasNextLine()){

            this.setName(userInput.nextLine());


        }

        this.setFavouriteChar();
        this.setUniqueID();
    }

    // To execute it
    public static void main(String[] args) {

        Animal theAnimal = new Animal();

        int[] favoriteNumber = new int[20];
        favoriteNumber[0] = 100;

        String[] stringArray = {"Random", "Words", "Here"};

        for(String word : stringArray){

            System.out.println(word);

        }

        String[][][] arrayName =  { { {"000"}, {"100"}, {"200"}, {"300"} },
                                    { {"010"}, {"110"}, {"210"}, {"310"} },
                                    { {"020"}, {"120"}, {"220"}, {"320"} }};

        for(int i = 0; i < arrayName.length; i++)
        {
            for(int j = 0; j < arrayName[i].length; j++)
            {
                for(int k = 0; k < arrayName[i][j].length; k++)
                {
                    System.out.print("| " + arrayName[i][j][k] + " ");
                }
            }

            System.out.println("|");

        }

        //to copy an array
        String[] cloneOfArray = Arrays.copyOf(stringArray, 3);

        System.out.println(Arrays.toString(cloneOfArray));

        System.out.println(Arrays.binarySearch(cloneOfArray, "Random"));

    }

}
