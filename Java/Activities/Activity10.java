package Activities;

import java.util.HashMap;
import java.util.HashSet;

public class Activity10 {
    public static void main(String args[])
    {
        HashSet <String>hs= new HashSet<>();
        hs.add("Ammu");
        hs.add("renu");
        hs.add("rahul");
        hs.add("ponnu");
        hs.add("chinnu");
        hs.add("kuttu");
        System.out.println("The size of the hash set is: "+ hs.size());
       System.out.println("Remove rahul from list :" +hs.remove("rahul"));
        if(hs.remove("rohith"))// if the condition evaluated to TRUE
            System.out.println("Removed rohith from list");
        else
            System.out.println("Rohith is not present in the list");
        System.out.println("Kuttu is present in list:"+ hs.contains("kuttu"));
        System.out.println("Updated hash set"+hs);
    }
}
