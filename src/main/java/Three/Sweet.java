package Three;

public class Sweet {

    private String name;
    private float weight;
    private int price;
    public Sweet(String name, float weight, int price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Object getSpecialty() {
        return "Пустота";
    }

    public String getAbout() {
        return "Пустота";
    }
}
