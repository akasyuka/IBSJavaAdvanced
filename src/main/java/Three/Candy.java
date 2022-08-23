package Three;

public class Candy extends Sweet{
    private String taste;

    public Candy(String name, float weight, int price, String taste) {
        super(name, weight, price);
        this.taste = taste;
    }

    @Override
    public Object getSpecialty() {
        return taste;
    }

    @Override
    public  String getAbout() {
        return "Вкус";
    }
}
