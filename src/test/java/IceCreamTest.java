import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class IceCreamTest {


        IceCream iceCream;

        @Before
        public void before(){
            iceCream = new IceCream("Ice Cream UK", "Ian Wright", 8, 4);
        }

        @Test
        public void hasName() {
            assertEquals("Ice Cream UK", iceCream.getName());
        }

        @Test
        public void hasOwnerName() {
            assertEquals("Ian Wright", iceCream.getOwnerName());
        }

        @Test
        public void hasParkingSpot() {
            assertEquals(8, iceCream.getParkingSpot());
        }
}
