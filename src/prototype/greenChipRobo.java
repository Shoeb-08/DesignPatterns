package prototype;

import java.util.*;
import java.util.HashMap;
import java.util.Map;
class greenChipRobo extends robo
{
    public greenChipRobo()
    {
        this.colorName = "greenBody";
    }

    @Override
    void addChip()
    {
        System.out.println("green robo is constructed");
    }

}