import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CandyFlossTest {

    CandyFloss candyFloss;

    @Before
    public void before(){
        candyFloss = new CandyFloss("Candy Floss UK", "Dennis Bergkamp", 10, 3);
    }

    @Test
    public void hasName() {
        assertEquals("Candy Floss UK", candyFloss.getName());
    }

    @Test
    public void hasOwnerName() {
        assertEquals("Dennis Bergkamp", candyFloss.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(10, candyFloss.getParkingSpot());
    }
}
