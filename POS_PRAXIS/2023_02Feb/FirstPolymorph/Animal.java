public class Animal {

    private int age;
    private String name;

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void animalSound() {
        System.out.println("The animal says...");
    }

    public void animalSoundWithName() {
        System.out.println(getName() + " says...");
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

}


class Cat extends Animal {

    Cat(int age, String name) {
        super(age, name);   // calls the Animal(int age, String name) constructor
    }

    @Override   // specific to Cat
    public void animalSound() {
        System.out.println("The cat says meow.");
    }

    @Override
    public void animalSoundWithName() {
        System.out.println(getName() + " says meow.");
    }

}


class Dog extends Animal {

    Dog(int age, String name) {
        super(age, name);   // calls the Animal(int age, String name) constructor
    }

    @Override   // specific to Dog
    public void animalSound() {
        System.out.println("The dog says woof.");
    }

    @Override
    public void animalSoundWithName() {
        System.out.println(getName() + " says woof.");
    }

}