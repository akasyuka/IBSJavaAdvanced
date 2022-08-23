package Four;


import Six.CustomNullException;

public class Four {
    public static void main(String[] args) {
        Calculator calculatorInteger = new CalculatorIntegerImpl(3, 0);
        System.out.println("Результат сложения = " + calculatorInteger.sum());
        System.out.println("Результат вычитания = " + calculatorInteger.sub());
        System.out.println("Результат умножения = " + calculatorInteger.mult());
        try {
            System.out.println("Результат деления = " + calculatorInteger.div());
        } catch (CustomNullException e) {
            e.printStackTrace();
        }


        System.out.println("------------------");

        Calculator calculatorFloat = new CalculatorFloatImpl(3.0F, 0);
        System.out.println("Результат сложения = " + calculatorFloat.sum());
        System.out.println("Результат вычитания = " + calculatorFloat.sub());
        System.out.println("Результат умножения = " + calculatorFloat.mult());
        try {
            System.out.println("Результат деления = " + calculatorFloat.div());
        } catch (CustomNullException e) {
            e.printStackTrace();
        }
    }
}
