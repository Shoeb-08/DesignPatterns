package strategyDesignPattern;

public class AggressiveStrategy implements  IStrategy{
    @Override
    public void actionCommand() {
        System.out.println("Aggressively act on the body");
    }
}
