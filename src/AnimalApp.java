public class AnimalApp {

    public static void main(String[] args) {

        Animal a = new Animal();
        print(a.eat());
        print(a.sleep());

        print("");
        Cat c = new Cat();
        print(c.eat());
        print(c.sleep());
        print(c.purr());

        print("");
        Bird b = new Bird();
        print(b.eat());
        print(b.sleep());
        print(b.fly());

        print("");
        Dog d= new Dog();
        print(d.eat());
        print(d.sleep());
        print(d.bark());
        print("");
        Mouse m= new Mouse();
        print(m.eat());
        print(m.sleep());
        print(m.bite());


    }

    private static void print(String s) {
        System.out.println(s);
    }
}
