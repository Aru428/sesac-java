package _05_class._04_inheritance;

public class Dog extends Animal {
    public Dog(String name, int age) {
        setAge(age);
        setName(name);
        setType("강아지");
    }

    public void makeSound() {
        System.out.println("멍멍");
    }
}
