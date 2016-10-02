package mx.iteso.decorator.tacos;

import mx.iteso.decorator.Taco;

public class TacoNormal extends Taco {

    public TacoNormal(String size) {
        super(size);
        description = "Taco normal "+size;
    }

    @Override
    public double cost() {
        int c=8 ;
        if(this.getSize() == Taco.MINI)
        {
            c=6;
        }
        else
        if(this.getSize() == Taco.MEGA)
        {
            c=16;
        }
        return c ;
    }
}
