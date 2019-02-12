import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitor;

    @Before
    public void before(){
        tobaccoStall = new TobaccoStall("Tobacco UK", "Giles Grimandi", 20, 5);
        visitor = new Visitor("Andy", 40, 1.8, 5.0 );
    }

    @Test
    public void hasName() {
        assertEquals("Tobacco UK", tobaccoStall.getName());
    }

    @Test
    public void hasOwnerName() {
        assertEquals("Giles Grimandi", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(20, tobaccoStall.getParkingSpot());
    }

    @Test
    public void canCheckIfAllowed() {
        assertEquals(false, tobaccoStall.isAllowedTo(visitor));
    }
}
