package mx.iteso.decorator.meat;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.condiments.meat.Shrimp;
import mx.iteso.decorator.tacos.TacoNormal;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Edmundo on 01/10/2016.
 */
public class ShrimpTest {
    @Test
    public void fishDesc() throws Exception {
        Taco shrimp = new Shrimp(new TacoNormal(Taco.REGULAR));
        String desc = shrimp.getDescription();
        assertEquals("Taco normal regular de camaron",desc);

    }
    @Test
    public void shrimpCost() throws Exception {
        Taco shrimp = new Shrimp(new TacoNormal(Taco.REGULAR));
        double cost = shrimp.cost();
        assertEquals(12.0,cost,0);
    }
    @Test
    public void shrimpCostMega() throws Exception {
        Taco shrimp = new Shrimp(new TacoNormal(Taco.MEGA));
        double cost = shrimp.cost();
        assertEquals(24.0,cost,0);
    }
    @Test(expected = Exception.class)
    public void  shrimpCostMini() throws Exception {
        Taco shrimp = new Shrimp(new TacoNormal(Taco.MINI));

    }
}
