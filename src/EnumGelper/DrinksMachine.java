package EnumGelper;

public enum DrinksMachine {
    COFFEE(15.2),
    TEA(8.0),
    LIMONAD(20.0),
    MJITO(25.1),
    WATER(3.5),
    COLA(19.5),
    NOTHING(0.0);

    private final double price;

    DrinksMachine(double price){
        this.price = price;

    }


    public double getPrice(){
        return price;
    }
}
