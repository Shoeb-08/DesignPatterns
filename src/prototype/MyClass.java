package prototype;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
public class MyClass
{
    public static void main (String[] args)
    {
        System.out.println("genrate Prototype 1");
        factory.getPrototypeChipColor("greenBody").addChip();
        System.out.println("genrate Prototype 2");
        factory.getPrototypeChipColor("redBody").addChip();
        System.out.println("genrate Prototype 3");
        factory.getPrototypeChipColor("greenBody").addChip();
        System.out.println("genrate Prototype 4");
        factory.getPrototypeChipColor("redBody").addChip();
    }
}
