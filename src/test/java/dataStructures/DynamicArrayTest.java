package dataStructures;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DynamicArrayTest {

    private DynamicArray<String> testDynamicArray;

    final private int INIT_CAPACITY = 2;
    final private int TEST_INDEX_0 = 0;
    final private String TEST_VALUE_0 = "a";

    @Before
    final public void setUp() {
        testDynamicArray = new DynamicArray<>(INIT_CAPACITY);
    }

    @Test
    final public void testGetSetWorkCorrectly() {
        testDynamicArray.set(TEST_INDEX_0, TEST_VALUE_0);

        assertEquals("get value should be " + TEST_VALUE_0,
                TEST_VALUE_0,
                testDynamicArray.get(TEST_INDEX_0));
    }

    @Test
    final public void testInsertWorksCorrectly() {
        testDynamicArray.add("a"); // at index = 0
        testDynamicArray.add("b");
        testDynamicArray.add("c");

        testDynamicArray.insert(1, "d");

        assertEquals(4, testDynamicArray.getSize());
        assertEquals("a", testDynamicArray.get(0));
        assertEquals("d", testDynamicArray.get(1));
        assertEquals("b", testDynamicArray.get(2));
        assertEquals("c", testDynamicArray.get(3));
    }
}