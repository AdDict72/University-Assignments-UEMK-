class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void eat() {
        System.out.println(name + " is eating");
    }

    void sleep() {
        System.out.println(name + " is sleeping");
    }
}

class Dog extends Animal {
    Dog(String name, int age) {
        super(name, age);
    }
    void bark() {
        System.out.println(name + " is barking");
    }
}


public class Q_1 {
    public static void main(String[] args) {

        Dog myDog = new Dog("Buddy", 3);
        
        myDog.eat();
        myDog.sleep();
        myDog.bark();
    }
}
