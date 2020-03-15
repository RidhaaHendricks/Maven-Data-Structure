package za.ac.cput;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.*;

public class DataStructureTest
{

    // Test the Set Collection Method
    @Test
    public void testShowHashSet() {

        DataStructure ds = new DataStructure();

        ArrayList<String> listTest = new ArrayList<String>();

        listTest.add("Set");
        listTest.add("Example");
        listTest.add("Geeks");
        listTest.add("For");

        Set<String> setTest = new HashSet<String>(listTest);

        assertEquals(ds.ShowHashSet(), setTest);
    }

    // Test the List Collection Method
    @Test
    public void testShowList() {

        DataStructure ds = new DataStructure();
        List<String> ListNum = new ArrayList<>();
        ListNum.add("5");
        ListNum.add("7");
        ListNum.add("2");
        ListNum.add("3");
        ListNum.add("6");
        ListNum.add("7");

        ListNum.remove(2);

        assertEquals(ds.ShowList(), ListNum);
    }

    // Test the Map Method
    @Test
    public void testShowMap() {

        DataStructure ds = new DataStructure();

        Map<String, String> testMap = new HashMap<>();
        testMap.put("b", "Ben 10");

        assertEquals("Ben 10", ds.ShowMap());
    }

}
