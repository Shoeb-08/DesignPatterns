package strategyDesignPattern;

public class HumanBody {
    public static void main(String[] args) {
        Organisms coronaVirus=new Organisms("coronaVirus");
        Organisms immuneSystem=new Organisms("immuneSystem");
        System.out.println("when the virus effects the body");
        coronaVirus.setStrategy(new AggressiveStrategy());
        immuneSystem.setStrategy(new DefendStrategy());

        coronaVirus.action();
        immuneSystem.action();

        System.out.println("After vaccine and medicine is injected into the  body");
        coronaVirus.setStrategy(new DefendStrategy());
        immuneSystem.setStrategy(new AggressiveStrategy());

        coronaVirus.action();
        immuneSystem.action();


    }
}
