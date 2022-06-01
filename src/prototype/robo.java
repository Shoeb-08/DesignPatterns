package prototype;

import java.util.*;
import java.util.HashMap;
import java.util.Map;
abstract class robo implements Cloneable
{
    protected String colorName;
    abstract void addChip();
    public Object clone()
    {
        Object clone = null;
        try
        {
            clone = super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        return clone;
    }
}