package mx.iteso.decorator.condiments;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

public class Queso extends CondimentsDecorator {
    Taco taco;

    public Queso(Taco taco){
        super(taco.getSize());
        this.taco = taco;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " con queso";
    }

    @Override
    public double cost() {
        int c=2 ;
        if(taco.getSize() == Taco. MINI)
        {
            c=1;
        }
        else
        if(taco.getSize() == Taco.MEGA)
        {
            c=4;
        }
        return c + taco.cost();
    }
}
