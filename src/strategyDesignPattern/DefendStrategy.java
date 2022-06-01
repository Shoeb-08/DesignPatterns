package strategyDesignPattern;

public class DefendStrategy implements  IStrategy{

    @Override
    public void actionCommand() {
        System.out.println("Defend its organisms");
    }
}
