class Main {
    public static void main(String[] args) {
        Animal[] cats= {new Cat("Cat"), new Kitten1("kitten1"), new Kitten2("kitten2"), new Kitten3("kitten3")};
        for(Animal c:cats) {
            c.eat();
            c.sleep();
        }
    }
}


class Animal {
    String type;
    public Animal(String type) {
        this.type = type;
    }
    public void eat() {
        System.out.println(type + " eats");
    }
    public void sleep() {
        System.out.println(type + " sleeps");
    }
}
class Cat extends Animal {
    public Cat(String type) {
        super(type);
    }
    public void sleep() {
        System.out.println(type + " sleeps a lot");
    }
}
class Kitten1 extends Cat {
    public Kitten1(String type) {
        super(type);
    }
    public void eat() {
        System.out.println(type + " eats milk");
    }
}
class Kitten2 extends Cat {
    public Kitten2(String type) {
        super(type);
    }
    public void eat() {
        System.out.println(type + " eats snacks");
    }
}
class Kitten3 extends Cat {
    public Kitten3(String type) {
        super(type);
    }
    public void eat() {
        System.out.println(type + " eats everything");
    }
}