import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PlaygroundTest {

    Playground playground;
    Visitor visitor;

    @Before
    public void before(){
        playground = new Playground("Fun World");
        visitor = new Visitor("Arran", 4, 1.1, 5.0 );
    }

    @Test
    public void playgroundHasName() {
        assertEquals("Fun World", playground.getName());
    }

    @Test
    public void testIsAllowedTo() {
        assertEquals(false, playground.isAllowedTo(visitor));
    }
}
