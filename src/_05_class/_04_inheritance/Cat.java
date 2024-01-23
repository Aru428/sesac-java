package _05_class._04_inheritance;

public class Cat extends Animal {
    public Cat(String name, int age) {
        setAge(age);
        setName(name);
        setType("고양이");
    }

    @Override
    public void makeSound() {
        System.out.println("야옹");
    }
}
