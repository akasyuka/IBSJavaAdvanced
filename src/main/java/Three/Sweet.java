package Three;

public class Sweet {

    private String name;
    private float weight;
    private int price;
    private String feature;
    public Sweet(String name, float weight, int price, String feature) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.feature = feature;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
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
}
