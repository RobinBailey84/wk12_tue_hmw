import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;
    Visitor visitor;

    @Before
    public void before(){
        dodgems = new Dodgems("Bangers");
        visitor = new Visitor("Arran", 4, 1.1, 5.0 );
    }

    @Test
    public void hasName() {
        assertEquals("Bangers", dodgems.getName());
    }

    @Test
    public void hasDefaultPrice() {
        assertEquals(4.50, dodgems.defaultPrice());
    }

    @Test
    public void customerPrice() {
        assertEquals(2.25, dodgems.priceFor(visitor));
    }
}
