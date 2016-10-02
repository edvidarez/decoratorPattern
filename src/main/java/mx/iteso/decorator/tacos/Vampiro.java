package mx.iteso.decorator.tacos;

import mx.iteso.decorator.Taco;

public class Vampiro extends Taco{
    public Vampiro(String size) throws Exception {
        super(size);
        if(size != Taco.REGULAR)
            throw new Exception("Solo existen vampiros regulares");
        description = "Vampiro ";
    }
    @Override
    public double cost() {
        return 13.00;
    }
}
