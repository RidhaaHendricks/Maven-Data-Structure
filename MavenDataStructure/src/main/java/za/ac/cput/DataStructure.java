package za.ac.cput;

import java.util.*;

public class DataStructure
{
    public static void main( String[] args ){

        ShowHashSet();

        ShowList();

        System.out.println(ShowMap());

    }

    static List<String> newList;

    public static List<String> ShowList(){

        // List Data Structure
        newList = new ArrayList<String>();

        newList.add(0,"5");
        newList.add(1,"7");
        newList.add(2,"2");
        newList.add(3,"3");
        newList.add(4,"6");
        newList.add(5,"7");
        System.out.println("Show List");
        System.out.println(newList);

        List<String> testList = new ArrayList<String>(newList);

        testList.remove(2);

        System.out.println("Show updated List");

        return testList;

    }

    public static Set<String> ShowHashSet(){

        // Set Data Structure
        newList = new ArrayList<String>();

        newList.add("Geeks");
        newList.add("For");
        newList.add("Geeks");
        newList.add("Example");
        newList.add("Set");

        System.out.println("Show ArrayList");
        System.out.println(newList);

        Set<String> egHash = new HashSet<String>(newList);

        System.out.println("Set output without duplicates");
        System.out.println(egHash);

        return egHash;

    }

    static Map<String, String> map;

    public static String ShowMap(){

        // Map Data Structure
        map = new HashMap<>();
        String ops;

        map.put("a", "Amazing Spider-man");
        map.put("b", "Ben 10");
        map.put("c", "Cat Woman");
        map.put("d", "Die Hard");
        map.put("e", "Elder Scroll");
        map.put("f", "Forest Gump");

        ops = map.get("b");

        return String.format("%s", ops);
    }
}
