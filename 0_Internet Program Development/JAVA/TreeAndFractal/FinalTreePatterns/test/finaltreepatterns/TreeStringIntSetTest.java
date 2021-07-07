/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finaltreepatterns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author faruk
 */
public class TreeStringIntSetTest {
    
    public TreeStringIntSetTest() {
    }

    TreeStringIntSet tree = new TreeStringIntSet();
    /**
     * Test of iterator method, of class TreeStringIntSet.
     */
    @Test
    public void testIterator() throws DuplicateValueException {
        System.out.println("iterator");
        tree.add("Merry", 3);
        tree.add("Jerry", 2);
        tree.add("Jerry", 15);
        tree.add("Jerry", 1);
        tree.add("Jerry", 3);
        tree.add("Jerry", 22);
        tree.add("Tom", 2);
        tree.add("Tom", 9);
        tree.add("Tom", 17);
        tree.add("Tom", 22);
        tree.add("Tom", 35);
        String[] expResult = {
            "(Jerry=>1)",
            "(Jerry=>2)",
            "(Jerry=>3)",
            "(Jerry=>22)",
            "(Jerry=>15)",
            "(Merry=>3)",
            "(Tom=>17)",
            "(Tom=>2)",
            "(Tom=>35)",
            "(Tom=>22)",
            "(Tom=>9)"
        };
        Iterator<Pair<String, Integer>> result = tree.iterator();
        int count = 0;
        for (Pair i : tree) {
            System.out.println("i" + i.toString());
            assertEquals(i.toString(),expResult[count++]);
        }
        assertEquals(expResult.length,count);
    }

    /**
     * Test of add method, of class TreeStringIntSet.
     */
    @Test
    public void testAdd() throws DuplicateValueException {
        System.out.println("add");
        tree.add("Merry", 3);
        tree.add("Jerry", 5);
        tree.add("Berry", 1);
        tree.add("Cherry", 8);
        tree.add("Peter", 5);
        tree.add("Tom", 7);
        tree.add("Rose", 8);
        tree.add("York", 9);
        tree.add("Jerry", 2);
        tree.add("Jerry", 15);
        tree.add("Jerry", 1);
        tree.add("Jerry", 3);
        tree.add("Jerry", 22);
        tree.add("Tom", 2);
        tree.add("Tom", 9);
        tree.add("Tom", 17);
        tree.add("Tom", 22);
        tree.add("Tom", 35);
        int expResult = 8; // key number
        assertEquals(expResult,tree.size);
    }

    /**
     * Test of containsKey method, of class TreeStringIntSet.
     */
    @Test
    public void testContainsKey() throws DuplicateValueException {
        System.out.println("containsKey");
        tree.add("Merry", 3);
        tree.add("Jerry", 5);
        tree.add("Berry", 1);
        tree.add("Cherry", 8);
        tree.add("Peter", 5);
        tree.add("Tom", 7);
        tree.add("Rose", 8);
        tree.add("York", 9);
        tree.add("Jerry", 2);
        tree.add("Jerry", 15);
        tree.add("Jerry", 1);
        tree.add("Jerry", 3);
        tree.add("Jerry", 22);
        tree.add("Tom", 2);
        tree.add("Tom", 9);
        tree.add("Tom", 17);
        tree.add("Tom", 22);
        tree.add("Tom", 35);
        
        //true
        boolean expResult1 = true;
        boolean result1 = tree.containsKey("Jerry");
        assertEquals(expResult1, result1);        
        //false
        boolean expResult2 = false;
        boolean result2 = tree.containsKey("Test");
        assertEquals(expResult2, result2);          
    }

    /**
     * Test of getValuesOfKey method, of class TreeStringIntSet.
     */
    @Test
    @SuppressWarnings("empty-statement")
    public void testGetValuesOfKey() throws DuplicateValueException {
        System.out.println("getValuesOfKey");
        tree.add("Merry", 3);
        tree.add("Jerry", 5);
        tree.add("Berry", 1);
        tree.add("Cherry", 8);
        tree.add("Peter", 5);
        tree.add("Tom", 7);
        tree.add("Rose", 8);
        tree.add("York", 9);
        tree.add("Jerry", 2);
        tree.add("Jerry", 15);
        tree.add("Jerry", 1);
        tree.add("Jerry", 3);
        tree.add("Jerry", 22);
        tree.add("Tom", 2);
        tree.add("Tom", 9);
        tree.add("Tom", 17);
        tree.add("Tom", 22);
        tree.add("Tom", 35);
        //
        List<Integer> expResult = new ArrayList<Integer>();
        expResult.add(1);
        expResult.add(2);
        expResult.add(3);
        expResult.add(5);
        expResult.add(15);
        expResult.add(22);        
        List<Integer> result = tree.getValuesOfKey("Jerry");
        assertArrayEquals(expResult.toArray(), result.toArray());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getKeysContainingValue method, of class TreeStringIntSet.
     */
    @Test
    public void testGetKeysContainingValue() throws DuplicateValueException {
        System.out.println("getKeysContainingValue");
        tree.add("Merry", 3);
        tree.add("Jerry", 5);
        tree.add("Berry", 1);
        tree.add("Cherry", 8);
        tree.add("Peter", 5);
        tree.add("Tom", 7);
        tree.add("Rose", 8);
        tree.add("York", 9);
        tree.add("Jerry", 2);
        tree.add("Jerry", 15);
        tree.add("Jerry", 1);
        tree.add("Jerry", 3);
        tree.add("Jerry", 22);
        tree.add("Tom", 2);
        tree.add("Tom", 9);
        tree.add("Tom", 17);
        tree.add("Tom", 22);
        tree.add("Tom", 35);
        List<String> expResult = new ArrayList<String>();
        expResult.add("Jerry");
        expResult.add("Tom");
        List<String> result = tree.getKeysContainingValue(2);
        assertArrayEquals(expResult.toArray(), result.toArray());
    }

    /**
     * Test of getAllKeys method, of class TreeStringIntSet.
     */
    @Test
    public void testGetAllKeys() throws DuplicateValueException {
        System.out.println("getAllKeys");
        tree.add("Jerry", 2);
        tree.add("Jerry", 15);
        tree.add("Jerry", 1);
        tree.add("Jerry", 3);
        tree.add("Jerry", 22);
        tree.add("Tom", 2);
        tree.add("Tom", 9);
        tree.add("Tom", 17);
        tree.add("Tom", 22);
        tree.add("Tom", 35);
        List<String> expResult = new ArrayList<String>();
        expResult.add("Jerry");
        expResult.add("Tom");
        List<String> result = tree.getAllKeys();
        assertArrayEquals(expResult.toArray(), result.toArray());
    }

    /**
     * Test of getAllKeysValues method, of class TreeStringIntSet.
     */
    @Test
    public void testGetAllKeysValues() throws DuplicateValueException {
        System.out.println("getAllKeysValues");
        tree.add("Jerry", 2);
        tree.add("Jerry", 15);
        tree.add("Tom", 17);
        tree.add("Tom", 9);
        List<Pair<String, Integer>> expResult = new ArrayList<Pair<String, Integer>>();
        expResult.add(new Pair("Jerry", 2));
        expResult.add(new Pair("Jerry", 15));
        expResult.add(new Pair("Tom", 17));
        expResult.add(new Pair("Tom", 9));
        List<Pair<String, Integer>> result = tree.getAllKeysValues();
        assertEquals(Arrays.toString(expResult.toArray()), Arrays.toString(result.toArray()));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
