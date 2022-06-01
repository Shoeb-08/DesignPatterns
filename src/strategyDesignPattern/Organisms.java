package strategyDesignPattern;

public class Organisms {
    IStrategy behaviour;
    String type;
    public Organisms(String type){
        this.type=type;
    }
    public void setStrategy(IStrategy behaviour){
        this.behaviour=behaviour;
    }
    public void action(){
        System.out.println("Entity "+this.type);
        behaviour.actionCommand();
    }
}
