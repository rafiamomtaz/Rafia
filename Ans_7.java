class Animal {
    // Method to be overridden
    public void sound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    // Overriding the sound method
    @Override
    public void sound() {
        System.out.println("The dog barks");
    }
}

class Cat extends Animal {
    // Overriding the sound method
    @Override
    public void sound() {
        System.out.println("The cat meows");
    }
}

public class Ans_7 {
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); // Animal reference, Animal object
        Animal myDog = new Dog();       // Animal reference, Dog object
        Animal myCat = new Cat();       // Animal reference, Cat object

        myAnimal.sound();  // Outputs: The animal makes a sound
        myDog.sound();     // Outputs: The dog barks
        myCat.sound();     // Outputs: The cat meows
    }
}