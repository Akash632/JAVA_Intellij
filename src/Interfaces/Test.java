package Interfaces;

public class Test {
    public static void main(String[] args){
        Dog d = new Dog();
        d.sleep();

        Cat c = new Cat();
        d.eat();

        System.out.println(d.legs);
        System.out.println(Animal.legs);

        Animal.info();
        d.getInfo();
        c.getInfo();

    }
}
