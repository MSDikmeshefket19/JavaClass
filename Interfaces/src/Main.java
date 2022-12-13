import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        List<Animal> animal = new ArrayList<>();
        animal.add(cat);
        animal.add(dog);
        cat.test();


    }
}