package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

public class Chorizo extends CondimentsDecorator {
    Taco taco;

    public Chorizo(Taco taco){
        super(taco.getSize());
        this.taco = taco;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " de chorizo";
    }

    @Override
    public double cost() {
        int c=0 ;
        if(taco.getSize() == Taco.MINI)
        {
            c=-1;
        }
        else
        if(taco.getSize() == Taco.MEGA)
        {
            c=4;
        }
        return c + taco.cost();
    }

}
