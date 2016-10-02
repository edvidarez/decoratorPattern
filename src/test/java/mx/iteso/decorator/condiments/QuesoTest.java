package mx.iteso.decorator.condiments;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.tacos.TacoNormal;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Edmundo on 28/09/2016.
 */
public class QuesoTest {
    private Taco taco;
    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test
    public void testCost(){
        Taco queso = new Queso(taco);
        when(taco.cost()).thenReturn(8.0);
        double cost = queso.cost();
        assertEquals(10.0, cost,0);
    }
    @Test
    public void testDescription(){
        Taco queso = new Queso(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = queso.getDescription();
        assertEquals("Taco Normal con queso", desc);
    }
    @Test
    public void testMega(){
        Taco queso = new Queso(new TacoNormal(Taco.MEGA));
        when(taco.getDescription()).thenReturn("Taco normal");
        String desc = queso.getDescription();
        assertEquals("Taco normal mega con queso", desc);
    }
    @Test
    public void testCostMega(){
        Taco queso = new Queso(new TacoNormal(Taco.MEGA));
        when(taco.cost()).thenReturn(8.0);
        double cost = queso.cost();
        assertEquals(20.0, cost,0);
    }
    @Test
    public void testCostMini(){
        Taco queso = new Queso(new TacoNormal(Taco.MINI));
        when(taco.cost()).thenReturn(8.0);
        double cost = queso.cost();
        assertEquals(7.0, cost,0);
    }
    @Test
    public void testMini(){
        Taco queso = new Queso(new TacoNormal(Taco.MINI));
        when(taco.getDescription()).thenReturn("Taco normal");
        String desc = queso.getDescription();
        assertEquals("Taco normal mini con queso", desc);
    }
}
