package mx.iteso.decorator;

import mx.iteso.decorator.condiments.*;
import mx.iteso.decorator.condiments.meat.Chorizo;
import mx.iteso.decorator.tacos.TacoNormal;

public class TuTaco {
    public static void main(String[] args) throws Exception {
        Taco taco = new TacoNormal(Taco.REGULAR);
        System.out.println(taco.getDescription());
        System.out.println("$" + taco.cost() + " MXN");
        taco = new TortillaMaiz(taco);
        taco = new Chorizo(taco);
        taco = new Cebolla(taco);
        taco = new Cilantro(taco);
        System.out.println();
        System.out.println();
        System.out.println(taco.getDescription());
        System.out.println("$" + taco.cost() + " MXN");
    }
}
