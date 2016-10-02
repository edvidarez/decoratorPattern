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
public class TortillaMiniTest {
    private Taco tortillamini;
    @Before
    public void setUp(){
         tortillamini = new TacoNormal(Taco.MINI);
    }

    @Test
    public void testCost()  {

        double cost = tortillamini.cost();
        assertEquals(6, cost,0);
    }
    @Test
    public void testDescription(){

        String desc = tortillamini.getDescription();
        assertEquals("Taco normal mini", desc);
    }

}
