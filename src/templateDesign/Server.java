package templateDesign;

public class Server extends  PCTemplate{
    @Override
    public void installOs() {
        System.out.println("Installing Ubuntu");
    }

    @Override
    public void assembleComponents() {
        System.out.println("Joining all units, 0 hdmi ,1 VGA port");

    }
}
