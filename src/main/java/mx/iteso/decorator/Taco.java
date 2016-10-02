package mx.iteso.decorator;

public abstract class Taco {
    public static final String MINI =  "mini" ;
    public static final String REGULAR = "regular";
    public static final String MEGA = "mega";
    private String size = this.REGULAR;

    public String description = "Any Taco";
    public String getDescription(){
        return description;
    }

    public Taco(String size)
    {
        this.size = size;
    }
    public String getSize(){
        return size;
    }
    public abstract double cost();
}
