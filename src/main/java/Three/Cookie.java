package Three;

public class Cookie extends Sweet{

    private boolean haveChocolate;

    public Cookie(String name, float weight, int price, boolean haveChocolate) {
        super(name, weight, price);
        this.haveChocolate = haveChocolate;
    }

    @Override
    public Object getSpecialty() {
        return haveChocolate;
    }

    @Override
    public  String getAbout() {
        return "Содержит шоколад";
    }
}