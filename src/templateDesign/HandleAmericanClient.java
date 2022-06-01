package templateDesign;

public class HandleAmericanClient extends HandleClient{
    public HandleAmericanClient(String name){
        super(name);
        System.out.println("Starting with American Client");
    }
    @Override
    public void greet() {
        System.out.println("Hello, Good Morning "+name);

    }

    @Override
    public void conclude() {
        System.out.println("Thank you "+ name);
        System.out.println("Good Bye");

    }
}
