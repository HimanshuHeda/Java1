class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking...");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing...");
    }
}

public class hierarchical_inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        
        dog.eat();
        cat.eat();
        
        dog.bark();
        cat.meow();
    }
}
