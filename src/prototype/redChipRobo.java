package prototype;
class redChipRobo extends robo{
    public redChipRobo()
    {
        this.colorName = "redBody";
    }
    @Override
    void addChip()
    {
        System.out.println("red robo is constructed");
    }
}