public class Mouse extends Animal{

    public Mouse() {
        super();
        System.out.println("A mouse is running...");
    }


    @Override
    public String sleep() {
        return "A mouse sleeps soundly...";
    }

    @Override
    public String eat() {
        return "A mouse eats...";
    }


    public String bite() {

        return "A mouse bites...";
    }
}
