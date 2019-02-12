import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ParkTest {

    Park park;

    @Before
    public void before(){
        park = new Park("Fun Park");
    }

    @Test
    public void hasName() {
        assertEquals("Fun Park", park.getName());
    }
}
