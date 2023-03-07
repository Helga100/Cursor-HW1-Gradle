import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ServiceTest {

    @Test
    public void getStrTest() {
        String expectedStr = "Hello!";

        Service service = new Service();
        String actualStr = service.getStr();

        assertEquals(expectedStr, actualStr);
    }
}
