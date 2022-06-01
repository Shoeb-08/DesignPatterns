package templateDesign;

public class HandleJapaneseClient extends HandleClient{
    public HandleJapaneseClient(String name){
        super(name);
        System.out.println("Starting with Japanese Client");
    }
    @Override
    public void greet() {
        System.out.println("Konichiwa "+ name);

    }

    @Override
    public void conclude() {
        System.out.println("Arigato "+ name);
        System.out.println("Sayonara");

    }
}
