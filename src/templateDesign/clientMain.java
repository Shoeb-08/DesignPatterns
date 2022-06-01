package templateDesign;

public class clientMain {
    public static void main(String[] args) {

        HandleClient c1= new HandleAmericanClient("LeBron James");
        c1.handleCLient();
        HandleClient c2=new HandleJapaneseClient("Naruto ");
        c2.handleCLient();
        HandleClient c3=new HandleFrenchClient("Mbappe");
        c3.handleCLient();

        /*PCTemplate laptop= new Laptop();
        laptop.buildPC();
        System.out.println("Server");
        PCTemplate server =new Server();
        server.buildPC();*/
    }
}
