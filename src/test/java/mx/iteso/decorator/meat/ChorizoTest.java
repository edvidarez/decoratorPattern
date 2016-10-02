package mx.iteso.decorator.meat;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.condiments.meat.Chorizo;
import mx.iteso.decorator.tacos.TacoNormal;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Edmundo on 01/10/2016.
 */
public class ChorizoTest {
    @Test
    public void chorizoDesc() {
        Taco chorizo = new Chorizo(new TacoNormal(Taco.REGULAR));
        String desc = chorizo.getDescription();
        assertEquals("Taco normal regular de chorizo",desc);

    }
    @Test
    public void chorizoCost() {
        Taco chorizo = new Chorizo(new TacoNormal(Taco.REGULAR));
        double cost = chorizo.cost();
        assertEquals(8.0,cost,0);
    }
    @Test
    public void chorizoCostMega() {
        Taco chorizo = new Chorizo(new TacoNormal(Taco.MEGA));
        double cost = chorizo.cost();
        assertEquals(20.0,cost,0);
    }
    @Test
    public void  chorizoCostMini() {
        Taco chorizo = new Chorizo(new TacoNormal(Taco.MINI));
        double cost = chorizo.cost();
        assertEquals(5.0,cost,0);
    }
}
