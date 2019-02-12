import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;
    Visitor visitor;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster("Big Dipper");
        visitor = new Visitor("Arran", 4, 1.1, 5.0 );
    }

    @Test
    public void hasName() {
        assertEquals("Big Dipper", rollercoaster.getName());
    }

    @Test
    public void canCheckIfAllowed() {
        assertEquals(true, rollercoaster.isAllowedTo(visitor));
    }

    @Test
    public void checkDefaultPrice() {
        assertEquals(8.40, rollercoaster.defaultPrice());
    }

    @Test
    public void checkCustomerPrice() {
        assertEquals(16.8, rollercoaster.priceFor(visitor));
    }
}
