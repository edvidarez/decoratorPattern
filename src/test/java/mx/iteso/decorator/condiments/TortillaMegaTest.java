package mx.iteso.decorator.condiments;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.tacos.TacoNormal;
import mx.iteso.decorator.tacos.Vampiro;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Edmundo on 28/09/2016.
 */
public class TortillaMegaTest {
    private Taco taco;
    @Before
    public void setUp(){
        taco = new TacoNormal(Taco.MEGA);
    }

    @Test
    public void testCost()  {
        Taco tortillamega = new TacoNormal(Taco.MEGA);
        double cost = tortillamega.cost();
        assertEquals(16.0, cost,0);
    }
    @Test
    public void testDescription(){
        Taco tortillamega = new TacoNormal(Taco.MEGA);
        String desc = tortillamega.getDescription();
        assertEquals("Taco normal mega", desc);
    }
    @Test(expected=IndexOutOfBoundsException.class)
    public void testIndexOutOfBoundsException() {
        ArrayList emptyList = new ArrayList();
        Object o = emptyList.get(0);
    }
    @Test(expected = Exception.class)
    public void vampiroMega() throws Exception {

      Taco MegaVampiro =new Vampiro(Taco.MEGA);
    }
    @Test
    public void vampiro_desc() throws Exception {
        Taco vamp = new Vampiro(Taco.REGULAR);
        String desc = vamp.getDescription();
        assertEquals("Vampiro ",desc);
    }
    @Test
    public void vampiro_cost() throws Exception {
        Taco vamp = new Vampiro(Taco.REGULAR);
        double cost = vamp.cost();

        assertEquals(13.0,cost,0);
    }
}
