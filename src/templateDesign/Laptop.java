package templateDesign;

public class Laptop extends  PCTemplate{

    @Override
    public void installOs() {
        System.out.println("Installing windows OS");

    }

    @Override
    public void assembleComponents() {
        System.out.println("Joining all units, plus 4 HDMI ports");
    }
}
