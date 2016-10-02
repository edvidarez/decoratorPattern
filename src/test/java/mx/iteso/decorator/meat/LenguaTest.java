package mx.iteso.decorator.meat;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.condiments.meat.Lengua;
import mx.iteso.decorator.tacos.TacoNormal;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Edmundo on 01/10/2016.
 */
public class LenguaTest {
    @Test
    public void lenguaDesc() {
        Taco lengua = new Lengua(new TacoNormal(Taco.REGULAR));
        String desc = lengua.getDescription();
        assertEquals("Taco normal regular de lengua",desc);

    }
    @Test
    public void lenguaCost() {
        Taco lengua = new Lengua(new TacoNormal(Taco.REGULAR));
        double cost = lengua.cost();
        assertEquals(8.0,cost,0);
    }
    @Test
    public void lenguaCostMega() {
        Taco lengua = new Lengua(new TacoNormal(Taco.MEGA));
        double cost = lengua.cost();
        assertEquals(20.0,cost,0);
    }
    @Test
    public void lenguaCostMini() {
        Taco lengua = new Lengua(new TacoNormal(Taco.MINI));
        double cost = lengua.cost();
        assertEquals(5.0,cost,0);
    }
}
