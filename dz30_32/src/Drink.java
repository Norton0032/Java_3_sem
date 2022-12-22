
import java.io.Serializable;

public final class Drink extends MenuItem implements Alcoholable, Serializable {
    private  DrinkTypeEnum type;
    private double alcoholVol;

    public Drink(int cost, String name, String description, DrinkTypeEnum type, int volume) {
        super(cost, name, description);
        this.type = type;
        this.alcoholVol = volume;
    }


    public DrinkTypeEnum getType() {
        return type;
    }

    @Override
    public boolean isAlcoholicDrink() {
        return alcoholVol > 0;
    }

    @Override
    public double getAlcoholVol() {
        return alcoholVol;
    }
}
