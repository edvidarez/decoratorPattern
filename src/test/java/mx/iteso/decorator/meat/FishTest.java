package mx.iteso.decorator.meat;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.condiments.meat.Chorizo;
import mx.iteso.decorator.condiments.meat.Fish;
import mx.iteso.decorator.tacos.TacoNormal;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Edmundo on 01/10/2016.
 */
public class FishTest {
    @Test
    public void fishDesc() throws Exception {
        Taco fish = new Fish(new TacoNormal(Taco.REGULAR));
        String desc = fish.getDescription();
        assertEquals("Taco normal regular de pescado",desc);

    }
    @Test
    public void fishCost() throws Exception {
        Taco fish = new Fish(new TacoNormal(Taco.REGULAR));
        double cost = fish.cost();
        assertEquals(12.0,cost,0);
    }
    @Test
    public void fishCostMega() throws Exception {
        Taco fish = new Fish(new TacoNormal(Taco.MEGA));
        double cost = fish.cost();
        assertEquals(24.0,cost,0);
    }
    @Test(expected = Exception.class)
    public void  fishCostMini() throws Exception {
        Taco fish = new Fish(new TacoNormal(Taco.MINI));

    }
}
