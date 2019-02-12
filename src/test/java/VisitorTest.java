import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor("Steve Bould",35, 5.10, 20.0);
    }

    @Test
    public void hasAge() {
        assertEquals(35, visitor.getAge());
    }

    @Test
    public void hasHeight() {
        assertEquals(5.10, visitor.getHeight());
    }

    @Test
    public void hasMoney() {
        assertEquals(20.0, visitor.getMoney());
    }
}
