import org.junit.jupiter.api.Test;

public class DisabledOnOsTest {

    @DisabledOnOs({Os.MAC, Os.LINUX})
    @Test
    void conditionTest(){
        System.out.println("Test nie powinien działać na wybranych systemach");
    }
}
