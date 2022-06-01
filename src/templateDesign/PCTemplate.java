package templateDesign;

public abstract class PCTemplate {
    public final void buildPC(){
        collectComponents();
        assembleComponents();
        installOs();
        startComputer();
        System.out.println("Computer is ON");
    }

    private void startComputer() {
        System.out.println("System is booting");
    }

    public abstract void installOs();

    public abstract void assembleComponents();

    private void collectComponents() {

        System.out.println("Computer with 8 gb ram, 4 gb graphics cars, 1TB HDD");
    }
}
