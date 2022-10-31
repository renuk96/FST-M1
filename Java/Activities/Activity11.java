package Activities;

import java.util.HashMap;

public class Activity11 {
    public static void main(String args[])
    {
        HashMap<Integer,String> colours= new HashMap<>();
        colours.put(1,"Orange");
        colours.put(2,"Green");
        colours.put(3,"yellow");
        colours.put(4,"red");
        colours.put(5,"pink");
        System.out.println("Hash map" + colours);
        System.out.println("Remove the colour with index 3: " +colours.remove(3));
        if(colours.containsValue("Green"))
            System.out.println("Green is present in the list");
        else
            System.out.println("Green is not present in the list");
        System.out.println("The updated size of the list is "+ colours.size());
    }
}
