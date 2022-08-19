package Four;


public class Four {
    public static void main(String[] args) {
        Calculator calculatorInteger = new CalculatorIntegerImpl(3, 4);
        System.out.println(calculatorInteger.sum());
        System.out.println(calculatorInteger.sub());
        System.out.println(calculatorInteger.div());
        System.out.println(calculatorInteger.mult());

        Calculator calculatorFloat = new CalculatorFloatImpl(3.0F, 4.0F);
        System.out.println(calculatorFloat.sum());
        System.out.println(calculatorFloat.sub());
        System.out.println(calculatorFloat.div());
        System.out.println(calculatorFloat.mult());


    }



}
