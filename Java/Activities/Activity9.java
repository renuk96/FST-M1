package Activities;

import java.util.ArrayList;
import java.util.List;

public class Activity9 {
    public static void main(String args[])
    {
        List<String>  Mylist=new ArrayList<>();
        Mylist.add("ram");
        Mylist.add("sita");
        Mylist.add("leela");
        Mylist.add("rahul");
        Mylist.add("rajev");
        System.out.println("The names in the list:");
        for (String l:Mylist)
            System.out.println(l);
        System.out.println("third name in the list "+Mylist.get(2));
        System.out.println("leela exist in list: "+Mylist.contains("leela"));
        System.out.println("The size of the array is "+Mylist.size());
        Mylist.remove("leela");
        System.out.println("New list size "+ Mylist.size());

    }

}
