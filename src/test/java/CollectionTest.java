import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CollectionTest {
    @TestFactory
    Collection<DynamicTest> dynamicTestsFromCollection(){
        return Arrays.asList(
                DynamicTest.dynamicTest("1st dynamic test", ()->
                        assertTrue(true)),
                DynamicTest.dynamicTest("2nd dynamic test", ()->
                        assertEquals(4,2 * 2))
        );
    }
    @TestFactory
    Iterable<DynamicTest> dynamicTestsFromIterable(){
        return Arrays.asList(
                DynamicTest.dynamicTest("3st dynamic test", ()->
                        assertTrue(true)),
                DynamicTest.dynamicTest("4nd dynamic test", ()->
                        assertEquals(4,2 * 2))
        );
    }
    @TestFactory
    Iterator<DynamicTest> dynamicTestsFromIterator(){
        return Arrays.asList(
                DynamicTest.dynamicTest("3st dynamic test", ()->
                        assertTrue(true)),
                DynamicTest.dynamicTest("4nd dynamic test", ()->
                        assertEquals(4,2 * 2))).iterator();

    }
    @TestFactory
    Stream<DynamicTest> dynamicTestsFromStream(){
        Stream<String> inputStream = Stream.of("A","B","C");
        return inputStream.map(
                input -> DynamicTest.dynamicTest("Display name for input " + input,
                        ()-> {
                            System.out.println("Testing " + input);
                        })
        );
    }
}