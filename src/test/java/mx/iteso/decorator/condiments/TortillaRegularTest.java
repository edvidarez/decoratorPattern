package mx.iteso.decorator.condiments;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.tacos.TacoNormal;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Edmundo on 28/09/2016.
 */
public class TortillaRegularTest {
    private Taco taco;
    @Before
    public void setUp(){
        taco = new TacoNormal(Taco.REGULAR);
    }

    @Test
    public void testCost()  {
        Taco tortillaregular = new TacoNormal(Taco.REGULAR);
        double cost = tortillaregular.cost();
        assertEquals(8.0, cost,0);
    }
    @Test
    public void testDescription(){
        Taco tortillaregular = new TacoNormal(Taco.REGULAR);
        String desc = tortillaregular.getDescription();
        assertEquals("Taco normal regular", desc);
    }
}
