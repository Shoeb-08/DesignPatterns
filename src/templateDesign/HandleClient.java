package templateDesign;

public abstract class HandleClient {
    protected String name="";
    public HandleClient(String name){
        this.name=name;
    }
    public abstract  void greet();
    public abstract void conclude();

    public void handleCLient(){
        greet();
        System.out.println("Doing clinet operations");
        System.out.println("Performing Task1");
        System.out.println("Performing Task2");
        System.out.println("Performing Task3");
        conclude();
    }
}
