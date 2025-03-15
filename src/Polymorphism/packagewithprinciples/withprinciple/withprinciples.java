
package withprinciple;

abstract class Animal {
    abstract void speak();
}

class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("Dog is barking...");
    }
}

class Cat extends Animal {
    @Override
    void speak() {
        System.out.println("Cat is meowing...");
    }
}

 class withPrinciple {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        System.out.println("With Polymorphism:");
        dog.speak();
        cat.speak();
    }
}
