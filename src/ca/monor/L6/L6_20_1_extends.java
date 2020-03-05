package ca.monor.L6;

public class L6_20_1_extends {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.weight = 15;
        dog.age = 8;

        System.out.println("Dog Weight = "+dog.weight);
        System.out.println("Dog Age = "+ dog.age);
        dog.move();

        Bird bird = new Bird();
        bird.weight = 1;
        bird.age = 2;

    }
}
