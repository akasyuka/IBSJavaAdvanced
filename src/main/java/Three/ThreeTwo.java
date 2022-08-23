package Three;

public class ThreeTwo {
    public static void main(String[] args) {

        Sweet[] sweets = new Sweet[]{new Candy("Конфета Почемучка", 1F, 450, "Мята"),
                                      new Cake("Торт Наполеон", 0.450F, 500, 300),
                                      new Cookie("Печенье Овсяное", 0.100F, 60,true)};
        System.out.println("Список товаров:");
        int sumPrice = 0;
        float sumWeight = 0;
        for (Sweet sweet : sweets) {
            sumPrice = sweet.getPrice() + sumPrice;
            sumWeight = sweet.getWeight() + sumWeight;
            System.out.println(sweet.getName() + " " + sweet.getWeight() + " " + sweet.getPrice() + " " + sweet.getAbout() + " " + sweet.getSpecialty());
        }
        System.out.println("-----------------------------");
        System.out.print("Общий вес = ");
        System.out.printf("%.3f%n",sumWeight);
        System.out.println("Общая стоимость = " + sumPrice);
    }
}
