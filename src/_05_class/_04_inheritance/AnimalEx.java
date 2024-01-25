package _05_class._04_inheritance;

import java.util.ArrayList;

public class AnimalEx {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();

        Cat cat = new Cat("나비", 1);
        Dog dog = new Dog("크림", 7);

        animals.add(cat);
        animals.add(dog);

        for (Animal a:animals) {
            System.out.println("동물의 종: " + a.getType());
            System.out.println(a.getType() + "의 이름: " + a.getName());
            System.out.println(a.getType() + "의 나이: " + a.getAge());
            a.makeSound();
            System.out.println("===============================");
        }
    }
}
