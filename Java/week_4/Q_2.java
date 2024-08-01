
class Animal {
    void makeSound() {
        System.out.println("Animal is making a sound");
    }
}


class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog is barking");
    }
}

public class Q_2 {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound();
    }
}
