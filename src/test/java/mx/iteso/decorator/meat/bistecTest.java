package mx.iteso.decorator.meat;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.condiments.meat.Bistec;
import mx.iteso.decorator.tacos.TacoNormal;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Edmundo on 01/10/2016.
 */
public class bistecTest {
    @Test
    public void bistecDesc() {
        Taco bistec = new Bistec(new TacoNormal(Taco.REGULAR));
        String desc = bistec.getDescription();
        assertEquals("Taco normal regular de bistec",desc);

    }
    @Test
    public void bistecCost() {
        Taco bistec = new Bistec(new TacoNormal(Taco.REGULAR));
        double cost = bistec.cost();
        assertEquals(8.0,cost,0);
    }
    @Test
    public void bistecCostMega() {
        Taco bistec = new Bistec(new TacoNormal(Taco.MEGA));
        double cost = bistec.cost();
        assertEquals(20.0,cost,0);
    }
    @Test
    public void bistecCostMini() {
        Taco bistec = new Bistec(new TacoNormal(Taco.MINI));
        double cost = bistec.cost();
        assertEquals(5.0,cost,0);
    }
}
