import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.TestInfo;

public class SimpleRepeteadTest {

    @RepeatedTest(2)
    void test(){
        System.out.println("powtórka...");
    }

    @RepeatedTest(value = 2, name= "{displayName} {currentRepetition}/{totalRepetitions}")
    @DisplayName("Repeat!")
    void customDisplayName(TestInfo testInfo){
        System.out.println(testInfo.getDisplayName());
    }

    @RepeatedTest(value = 2, name= RepeatedTest.LONG_DISPLAY_NAME)
    @DisplayName("Repeat!")
    void customDisplayNameLong(TestInfo testInfo){
        System.out.println(testInfo.getDisplayName());
    }
    @RepeatedTest(value = 2, name= RepeatedTest.SHORT_DISPLAY_NAME)
    @DisplayName("Repeat!")
    void customDisplayNameShort(TestInfo testInfo){
        System.out.println(testInfo.getDisplayName());
    }
}
