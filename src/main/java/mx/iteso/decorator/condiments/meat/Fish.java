package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;
public class Fish extends CondimentsDecorator {
    Taco taco;

    public Fish (Taco taco) throws Exception {
        super(taco.getSize());
        if(taco.getSize()==Taco.MINI)
            throw new Exception("No existen tacos de pescado mini");
        this.taco = taco;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " de pescado";
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
