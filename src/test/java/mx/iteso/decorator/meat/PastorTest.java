package mx.iteso.decorator.meat;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.condiments.meat.Pastor;
import mx.iteso.decorator.tacos.TacoNormal;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Edmundo on 01/10/2016.
 */
public class PastorTest {
    @Test
    public void pastorDesc() {
        Taco pastor = new Pastor(new TacoNormal(Taco.REGULAR));
        String desc = pastor.getDescription();
        assertEquals("Taco normal regular de pastor",desc);

    }
    @Test
    public void pastorCost() {
        Taco pastor = new Pastor(new TacoNormal(Taco.REGULAR));
        double cost = pastor.cost();
        assertEquals(8.0,cost,0);
    }
    @Test
    public void pastorCostMega() {
        Taco pastor = new Pastor(new TacoNormal(Taco.MEGA));
        double cost = pastor.cost();
        assertEquals(20.0,cost,0);
    }
    @Test
    public void pastorCostMini() {
        Taco pastor = new Pastor(new TacoNormal(Taco.MINI));
        double cost = pastor.cost();
        assertEquals(4.0,cost,0);
    }
}
