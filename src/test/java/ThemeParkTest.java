import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    Visitor visitor;
    Rollercoaster rollercoaster;
    CandyFloss candyFloss;

    @Before
    public void before(){
        themePark = new ThemePark();
        visitor = new Visitor("Steve Bould",21, 6.2, 10.0);
        rollercoaster = new Rollercoaster("Pepsi Max");
        candyFloss = new CandyFloss("Candy Floss UK", "Dave", 1,2);
    }

    @Test
    public void hasEmptyAttractionsArray() {
        assertEquals(0, themePark.countAttractions());
    }

    @Test
    public void hasEmptyStallsArray() {
        assertEquals(0 ,themePark.countStalls());
    }

    @Test
    public void cabAddStall() {
        themePark.addStalls(candyFloss);
        assertEquals(1, themePark.countStalls());
    }

    @Test
    public void canAddAttractions() {
        themePark.addAttraction(rollercoaster);
        assertEquals(1, themePark.countAttractions());
    }

    @Test
    public void canVisit() {
        assertEquals("Steve Bould went on Pepsi Max", themePark.visit(visitor, rollercoaster));
    }
}
