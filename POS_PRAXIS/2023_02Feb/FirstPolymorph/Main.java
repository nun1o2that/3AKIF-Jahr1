public class Main {

    public static void main ( String [] args ) {

        Dog doggo = new Dog(12, "Great Grey Wolf Sif");
        Cat kitty = new Cat(4, "Garfield");

        System.out.println();
        System.out.println(doggo.getName() + " is " + doggo.getAge() + " years old.");
        System.out.println(kitty.getName() + " is " + kitty.getAge() + " years old.");
        System.out.println();

        doggo.animalSound();
        kitty.animalSound();

        System.out.println();

        doggo.animalSoundWithName();
        kitty.animalSoundWithName();

        System.out.println();

    }

}