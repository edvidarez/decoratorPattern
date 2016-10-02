package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;
public class Shrimp extends CondimentsDecorator {
    Taco taco;

    public Shrimp (Taco taco) throws Exception {
        super(taco.getSize());
        if(taco.getSize()==Taco.MINI)
            throw new Exception("No existen tacos de camaron mini");
        this.taco = taco;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " de camaron";
    }

    @Override
    public double cost() {
        int c=4 ;
        if(taco.getSize() == Taco.MEGA)
        {
            c=8;
        }
        return c + taco.cost();
    }
}
