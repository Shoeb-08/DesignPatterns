package prototype;

import java.util.HashMap;
import java.util.Map;
class factory {

    private static Map<String, robo> Map = new HashMap<String, robo>();

    static
    {
        Map.put("greenBody", new greenChipRobo());
        Map.put("redBody", new redChipRobo());
    }

    public static robo getPrototypeChipColor(String colorName)
    {
        return (robo) Map.get(colorName).clone();
    }
}