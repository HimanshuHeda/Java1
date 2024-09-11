interface Swimmer {
    void swim();
}

interface Flyer {
    void fly();
}

class Bird implements Swimmer, Flyer {
    public void swim() {
        System.out.println("Bird is swimming...");
    }

    public void fly() {
        System.out.println("Bird is flying...");
    }
}

public class multiple_inheritance {
    public static void main(String[] args) {
        Bird bird = new Bird();
        
        bird.swim();
        bird.fly();
    }
}
