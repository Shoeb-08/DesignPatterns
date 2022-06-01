package templateDesign;

public class HandleFrenchClient extends HandleClient{
    public HandleFrenchClient(String name) {
        super(name);
        System.out.println("Starting with French Client");
    }

    @Override
    public void greet() {
        System.out.println("Bonjour "+name);

    }

    @Override
    public void conclude() {
        System.out.println("Merci "+name);
        System.out.println("Au Revoir ");
    }
}
