
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class MyFirstJunitTest {
    @Test
    void myFirstTest(){
        String message = "1+1 should be equal to 2";
        System.out.println(message);
        assertEquals(2, 1 + 1, message);
    }

    @Test
    void standardAssertions(){
        assertEquals(2,2);
        assertTrue(true,"Opcjonalna wiadomość");
        assertFalse(false, ()-> "Really " + "expensive "+ "message" + ".");
    }

    @Test
    void groupedAssertions() {
        Address address = new Address("John", "Smith");
        assertAll("address", ()-> assertEquals("John",
                address.getFirstName()),
                ()-> assertEquals("Smith", address.getLastName()));
    }

    @Test
    void exceptionTesting(){
        Throwable exception =
                assertThrows(IllegalArgumentException.class, ()-> {
                    throw new IllegalArgumentException("wiadomość");});
        assertEquals("wiadomość", exception.getMessage());
    }
}
