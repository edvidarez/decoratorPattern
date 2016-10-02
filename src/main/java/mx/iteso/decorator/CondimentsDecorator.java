package mx.iteso.decorator;

public abstract class CondimentsDecorator extends Taco {
    public CondimentsDecorator(String size) {
        super(size);
    }

    public abstract String getDescription();
}
