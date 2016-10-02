package mx.iteso.decorator.tacos.tacos;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.condiments.Queso;
import mx.iteso.decorator.tacos.Quesadilla;
import mx.iteso.decorator.tacos.TacoNormal;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuesadillaTest {
    @Test
    public void testCost() {
        Taco taco = new Quesadilla(Taco.REGULAR);
        assertEquals(10.0, taco.cost(),0);
    }
    @Test
    public void desc ()
    {
        Taco taco = new Quesadilla(Taco.REGULAR);
        assertEquals("Quesadilla", taco.getDescription());
    }
}
