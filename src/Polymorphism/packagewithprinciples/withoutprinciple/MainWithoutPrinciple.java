
package withoutprinciple;

class Dog {
    void bark() {
        System.out.println("Dog is barking...");
    }
}

class Cat {
    void meow() {
        System.out.println("Cat is meowing...");
    }
}

public class MainWithoutPrinciple {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println("Without Polymorphism:");
        dog.bark();
        cat.meow();
    }
}
