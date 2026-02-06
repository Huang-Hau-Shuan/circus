package circus;

import circus.animal.Animal;
import circus.animal.Bird;
import circus.animal.Duck;

public class Trainer {
    public static void main(String[] args) {
        Duck d = new Duck(); // recall d is in stack, new Duck() is in heap
        getToSpeak(d);

        Bird b = (Bird) d;  // upcasting
        getToSpeak(b);

        Animal a = (Animal) b; // upcasting
        getToSpeak(a);

        Duck d2 = (Duck) a; // downcasting
        getToSpeak(d2);

        train(new Duck());
        // train(new Parrot());

        // Animal a2 = new Animal(); deleted this after making Animal abstract
        // what about Bird?
        // Bird b2 = new Bird();

    }

    private static void getToSpeak(Animal animal)  { // takes animal reference
        System.out.println(animal.speak());
    }

    private static void train(Bird bird) {

        if (bird instanceof Duck) {
            Duck d = (Duck) bird;
            d.swim();
        } else {
            System.out.println("not a duck, not a duck!!");
        }
    }
}
