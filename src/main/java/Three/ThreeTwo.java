package Three;

public class ThreeTwo {
    public static void main(String[] args) {

        Sweet[] candies = new Sweet[]{new Sweet("Тортик", 0.300F, 450, "Кремовый"),
                                      new Sweet("Булочка", 0.050F, 50, "С маком"),
                                      new Sweet("Печенье", 0.100F, 60, "Злаковое")};
        System.out.println("Список товаров:");
        int sumPrice = 0;
        float sumWeight = 0;
        for (Sweet sweet : candies) {
            sumPrice = sweet.getPrice() + sumPrice;
            sumWeight = sweet.getWeight() + sumWeight;
            System.out.println(sweet.getName() + " " + sweet.getWeight() + " " + sweet.getPrice() + " " + sweet.getFeature());
        }
        System.out.println("-----------------------------");
        System.out.print("Общий вес = ");
        System.out.printf("%.3f%n",sumWeight);
        System.out.println("Общая стоимость = " + sumPrice);
    }
}
