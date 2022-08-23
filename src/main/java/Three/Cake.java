package Three;

public class Cake extends Sweet{

    private int calories;
    public Cake(String name, float weight, int price, int calories) {
        super(name, weight, price);
        this.calories = calories;
    }

    @Override
    public Object getSpecialty() {
        return calories;
    }

    @Override
    public  String getAbout() {
        return "Калорийность";
    }
}
